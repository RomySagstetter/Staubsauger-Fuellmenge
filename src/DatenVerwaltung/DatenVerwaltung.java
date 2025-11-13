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

    public double getFuellstandProzent() {
        return (double) sensor.getFuellstand() / (double) sensor.getMaxFuellstand();
    }

    public boolean NotAus() {
        return sensor.NotAus();
    }

    public boolean stoppNotAus() {
        return sensor.stoppNotAus();
    }
}

