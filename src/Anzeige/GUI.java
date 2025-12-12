package Anzeige;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.border.LineBorder;

import AnzeigeVerwaltung.AnzeigeVerwaltung;
import DatenVerwaltung.DatenVerwaltung;
import Fuellstandsensor.Fuellstandsensor;

public class GUI extends JFrame {

    private final Anzeige anzeige;
    private final AnzeigeVerwaltung anzeigeVerwaltung = AnzeigeVerwaltung.getInstance();
    private final DatenVerwaltung datenVerwaltung = DatenVerwaltung.getInstance();
    private final Fuellstandsensor sensor = Fuellstandsensor.getInstance();

    private final TextOutline fuellstandProzentField;
    private final JTextField messageField;
    private final JButton wechselnButton;
    private final JButton saugenButton;

    public GUI(Anzeige anzeige) {
        super("Füllstand - Anzeige");
        this.anzeige = anzeige;

        this.getContentPane().setLayout(null);

        // Komponenten anlegen
        fuellstandProzentField = new TextOutline ();
        //outline ausschalten     
        this.getContentPane().add(fuellstandProzentField);
        fuellstandProzentField.setOutlineEnabled(false);
        

        messageField = new JTextField();
        messageField.setEditable(false);

        wechselnButton = new JButton("Füllbeutel wechseln");
        saugenButton = new JButton("saugen");

        // Positionen
        fuellstandProzentField.setBounds(5, 10, 350, 80);
        messageField.setBounds(5, 90, 350, 25);
        saugenButton.setBounds(5, 120, 120, 30);
        wechselnButton.setBounds(130, 120, 200, 30);

        // Listener: Saugen -> erhöht Füllstand, solange gedrückt
        Timer saugTimer = new Timer(100, e -> {
        	int aktuell = sensor.getFuellstand();
        	if (aktuell < sensor.getMaxFuellstand()) {
        		sensor.setFuellstand(aktuell + 1);
        		updateAnzeige();
        	}else {System.out.println("System wurde pausiert");}
        });

        saugenButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent e) {
                saugTimer.start();
            }

            @Override
            public void mouseReleased(java.awt.event.MouseEvent e) {
                saugTimer.stop();
            }
        });


        // Listener: Wechseln -> ruft Anzeige.FuellbeutelWechseln()
        wechselnButton.addActionListener((ActionEvent e) -> {
        	saugTimer.stop();
            anzeige.FuellbeutelWechseln();
            System.out.println("FüllbeutelWechslen in GUI aufgerufen");
            updateAnzeige();
        });

        // Fenster schließen beendet Programm
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Stoppen ggf. Timer (hier nicht nötig), dann exit
                System.exit(0);
            }
        });

        // Komponenten hinzufügen
        this.getContentPane().add(fuellstandProzentField);
        this.getContentPane().add(messageField);
        
        this.getContentPane().add(wechselnButton);

        this.setSize(350, 200);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        // Timer: aktualisiert GUI regelmäßig (alle 500 ms)
        Timer timer = new Timer(500, e -> updateAnzeige());
        timer.start();

        // Erstmaliger Refresh
        SwingUtilities.invokeLater(this::updateAnzeige);
    }

    /**
     * Aktualisiert Textfelder und Farben anhand des aktuellen Zustands.
     * Läuft auf EDT durch Timer.
     */
    private void updateAnzeige() {
        double prozent = datenVerwaltung.getFuellstandProzent() * 100.0;
        String fuellText = String.format("%.0f%%", prozent);
        fuellstandProzentField.setText(fuellText);

        if (anzeigeVerwaltung.stoerGrenzeErreicht()) {
            messageField.setText("Die maximale Füllmenge ist erreicht");
            fuellstandProzentField.setColor(Color.red);
            fuellstandProzentField.setOutlineEnabled(true);
            fuellstandProzentField.setTextSize(80);
            this.getContentPane().remove(saugenButton);
            wechselnButton.setBounds(5, 120, 320, 30);
        } else if(anzeigeVerwaltung.warnGrenzeErreicht()) {
        	messageField.setText("Der Füllbeutel ist bald voll");
            fuellstandProzentField.setColor(new java.awt.Color(255, 153, 0));
            fuellstandProzentField.setOutlineEnabled(true);
        } else {
            messageField.setText("OK");
            fuellstandProzentField.setColor(Color.BLACK);
            fuellstandProzentField.setOutlineEnabled(false);
            fuellstandProzentField.setTextSize(60);
            this.getContentPane().add(saugenButton);
            wechselnButton.setBounds(130, 120, 200, 30);
        }
    }
}
