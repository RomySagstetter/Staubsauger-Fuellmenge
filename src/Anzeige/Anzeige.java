package Anzeige;

import AnzeigeVerwaltung.AnzeigeVerwaltung;
import DatenVerwaltung.DatenVerwaltung;

/**
 * GUI verwaltet eigene Updates per Timer.
 */
public class Anzeige {

    private static Anzeige single_instance = null;
    private final AnzeigeVerwaltung anzeigeVerwaltung;
    private final DatenVerwaltung datenVerwaltung;
    private final GUI gui;

    private Anzeige() {
        this.anzeigeVerwaltung = AnzeigeVerwaltung.getInstance();
        this.datenVerwaltung = DatenVerwaltung.getInstance();
        this.gui = new GUI(this);
    }

    public static synchronized Anzeige getInstance() {
        if (single_instance == null)
            single_instance = new Anzeige();
        return single_instance;
    }

    /**
     * Zeigt die Anzeige an
     * GUI startet eigene Timer zur Aktualisierung.
     */
    public void showAnzeige() {
        gui.setLocation(10, 10);
        gui.setVisible(true);
    }

    public boolean FuellbeutelWechseln() {
        System.out.println("FüllbeutelWechslen in Anzeige aufgerufen");
        return datenVerwaltung.stoppNotAus();
    }

    public AnzeigeVerwaltung getAnzeigeVerwaltung() {
        return anzeigeVerwaltung;
    }

    public DatenVerwaltung getDatenVerwaltung() {
        return datenVerwaltung;
    }
}

