package DatenVerwaltung;

import Fuellstandsensor.Fuellstandsensor;

/* holt Daten von Füllstandsensor und wertet sie für Anzeige auf */
public class DatenVerwaltung {

    private static DatenVerwaltung single_instance = null;
    private final Fuellstandsensor sensor;

    private DatenVerwaltung() {
        this.sensor = Fuellstandsensor.getInstance();
    }

    public static synchronized DatenVerwaltung getInstance() {
        if (single_instance == null)
            single_instance = new DatenVerwaltung();
        return single_instance;
    }

    /**
     * @return Füllstand als Wert zwischen 0.0 und 1.0
     */
    public double getFuellstandProzent() {
        // Gleitkomma-Division, sonst nur 0 oder 1
    	System.out.println("Füllstand in Prozent \n aktueller Füllstand: " + sensor.getFuellstand());
    	System.out.println("in Prozent: " + (double) sensor.getFuellstand() / (double) sensor.getMaxFuellstand());
    	System.out.println("maxFüllstand in DatenVerwaltung: " + sensor.getMaxFuellstand());
        return (double) sensor.getFuellstand() / (double) sensor.getMaxFuellstand();
    }

    public boolean NotAus() {
    	System.out.println("NotAus in DatenVerwaltung aufgerufen");
        return sensor.NotAus();
    }

    public boolean stoppNotAus() {
        return sensor.stoppNotAus();
    }
}
