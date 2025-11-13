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

import AnzeigeVerwaltung.AnzeigeVerwaltung;
import DatenVerwaltung.DatenVerwaltung;
import Fuellstandsensor.Fuellstandsensor;

public class GUI extends JFrame {

    private final Anzeige anzeige;
    private final AnzeigeVerwaltung anzeigeVerwaltung = AnzeigeVerwaltung.getInstance();
    private final DatenVerwaltung datenVerwaltung = DatenVerwaltung.getInstance();
    private final Fuellstandsensor sensor = Fuellstandsensor.getInstance();

    private final JTextField fuellstandProzentField;
    private final JTextField messageField;
    private final JButton wechselnButton;
    private final JButton saugenButton;

    public GUI(Anzeige anzeige) {
        super("Füllstand - Anzeige");
        this.anzeige = anzeige;

        this.getContentPane().setLayout(null);

        // Komponenten anlegen
        fuellstandProzentField = new JTextField();
        fuellstandProzentField.setEditable(false);
        fuellstandProzentField.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 24));

        messageField = new JTextField();
        messageField.setEditable(false);

        wechselnButton = new JButton("Füllbeutel wechseln");
        saugenButton = new JButton("saugen");

        // Positionen
        fuellstandProzentField.setBounds(5, 10, 400, 25);
        messageField.setBounds(5, 80, 400, 25);
        saugenButton.setBounds(5, 110, 120, 30);
        wechselnButton.setBounds(200, 110, 200, 30);

        // Listener: Saugen -> erhöht Füllstand, solange gedrückt
        Timer saugTimer = new Timer(100, e -> {
        	int aktuell = sensor.getFuellstand();
        	if (aktuell < sensor.getMaxFuellstand()) {
        		sensor.setFuellstand(aktuell + 1);
        		updateAnzeige();
        	}
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
            anzeige.FuellbeutelWechseln();
            updateAnzeige();
        });

        // Fenster schließen beendet Programm
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Komponenten hinzufügen
        this.getContentPane().add(fuellstandProzentField);
        this.getContentPane().add(messageField);
        this.getContentPane().add(saugenButton);
        this.getContentPane().add(wechselnButton);

        this.setSize(420, 200);
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
     */
    private void updateAnzeige() {
        double prozent = datenVerwaltung.getFuellstandProzent() * 100.0;
        String fuellText = String.format("%.0f%%", prozent);
        fuellstandProzentField.setText(fuellText);

        if (anzeigeVerwaltung.GrenzeErreicht()) {
            messageField.setText("Die maximale Füllmenge ist erreicht");
            fuellstandProzentField.setForeground(Color.RED);
        } else {
            messageField.setText("");
            fuellstandProzentField.setForeground(Color.BLACK);
        }
    }
}
