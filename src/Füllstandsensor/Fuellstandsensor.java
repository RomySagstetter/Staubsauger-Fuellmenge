package Fuellstandsensor;

/* misst Füllstand */
public class Fuellstandsensor {

    private static Fuellstandsensor single_instance = null;

    private int fuellstand = 0;
    private int maxFuellstand = 50;
    private boolean notAus = false;

    private Fuellstandsensor() {
    }

    public static synchronized Fuellstandsensor getInstance() {
        if (single_instance == null)
            single_instance = new Fuellstandsensor();
        return single_instance;
    }

    public synchronized int getFuellstand() {
        return fuellstand;
    }

    public synchronized void setFuellstand(int fuellstand) {
        if (fuellstand < 0) fuellstand = 0;
        if (fuellstand > maxFuellstand) fuellstand = maxFuellstand;
        this.fuellstand = fuellstand;
    }

    public int getMaxFuellstand() {
        return maxFuellstand;
    }

    /* Not-Aus aktivieren */
    public synchronized boolean NotAus() {
        notAus = true;
        return notAus;
    }

    /* NotAus deaktivieren */
    public synchronized boolean stoppNotAus() {
        fuellstand = 0;
        notAus = false;
        return notAus;
    }
}

