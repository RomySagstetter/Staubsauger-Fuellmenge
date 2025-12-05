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

    /**
     * @return true, wenn Füllstand >= 100%
     */
    public boolean stoerGrenzeErreicht() {
        double wert = datenVerwaltung.getFuellstandProzent();
        if (wert >= 1.0) {
        	System.out.println("Störgrenze erreicht");
        	System.out.println("NotAus in AnzeigeVerwaltung aufrufen");
            datenVerwaltung.NotAus();
            return true;
        }
        System.out.println("Störgrenze nicht erreicht");
        return false;
    }
    
    public boolean warnGrenzeErreicht() {
    	double wert = datenVerwaltung.getFuellstandProzent();
        if (wert >= 0.9) {
        	System.out.println("Warngrenze erreicht");
            return true;
        }
        System.out.println("Warngrenze nicht erreicht");
        return false;
    }
}
