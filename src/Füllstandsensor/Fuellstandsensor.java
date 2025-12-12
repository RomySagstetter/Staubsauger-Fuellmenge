package Fuellstandsensor;

import java.util.prefs.Preferences;

/* misst Füllstand */
public class Fuellstandsensor {
	
    private static Fuellstandsensor single_instance = null;
  //Persistenz
    private final Preferences prefs = Preferences.userNodeForPackage(Fuellstandsensor.class);

    private int fuellstand = 0;
    private int maxFuellstand = 50;
    private boolean notAus = false;

    private Fuellstandsensor() {
    	fuellstand = prefs.getInt("fuellstand", 0);
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
        prefs.putInt("fuellstand", fuellstand);
    }

    public int getMaxFuellstand() {
    	System.out.println("maxFüllstand in Füllstandsensor: " + maxFuellstand);
        return maxFuellstand;
    }

    /* vereinfacht: Not-Aus aktivieren */
    public synchronized boolean NotAus() {
        notAus = true;
        System.out.println("Füllstandsensor NotAus: " + notAus);
        return notAus;
    }

    /* nur wenn Füllbeutel gewechselt wurde: Reset */
    public synchronized boolean stoppNotAus() {
        fuellstand = 0;
        notAus = false;
        prefs.putInt("fuellstand", fuellstand);
        return notAus;
    }
}
