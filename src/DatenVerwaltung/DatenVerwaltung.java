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
        return (double) sensor.getFuellstand() / (double) sensor.getMaxFuellstand();
    }

    public boolean NotAus() {
        return sensor.NotAus();
    }

    public boolean stoppNotAus() {
        return sensor.stoppNotAus();
    }
}

