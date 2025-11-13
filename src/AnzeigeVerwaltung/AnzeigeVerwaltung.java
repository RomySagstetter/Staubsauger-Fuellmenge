package AnzeigeVerwaltung;

import DatenVerwaltung.DatenVerwaltung;

/* prüft Grenzen */
public class AnzeigeVerwaltung {

    private static AnzeigeVerwaltung single_instance = null;
    private final DatenVerwaltung datenVerwaltung;

    private AnzeigeVerwaltung() {
        this.datenVerwaltung = DatenVerwaltung.getInstance();
    }

    public static synchronized AnzeigeVerwaltung getInstance() {
        if (single_instance == null)
            single_instance = new AnzeigeVerwaltung();
        return single_instance;
    }

    public boolean GrenzeErreicht() {
        double wert = datenVerwaltung.getFuellstandProzent();
        if (wert >= 1.0) {
            datenVerwaltung.NotAus();
            return true;
        }
        return false;
    }
}

