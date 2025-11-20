package Tests;

import javax.swing.SwingUtilities;

import Anzeige.Anzeige;
import AnzeigeVerwaltung.AnzeigeVerwaltung;
import DatenVerwaltung.DatenVerwaltung;
import Fuellstandsensor.Fuellstandsensor;

public class TestSprint1 {

    private final AnzeigeVerwaltung anzeigeVerwaltung = AnzeigeVerwaltung.getInstance();
    private final DatenVerwaltung datenVerwaltung = DatenVerwaltung.getInstance();
    private final Fuellstandsensor sensor = Fuellstandsensor.getInstance();
    
    TestSprint1(){
    	
    }
    
    public void MT1() {
    	sensor.NotAus();
    }
    
    public void MT2() {
		System.out.println("für Füllstand < maxFüllstand");
    	sensor.setFuellstand(5);
		anzeigeVerwaltung.GrenzeErreicht();

		System.out.println("für Füllstand >= maxFüllstand");
		sensor.setFuellstand(55);
		anzeigeVerwaltung.GrenzeErreicht();
	}
    
    public void MT3() {
		datenVerwaltung.getFuellstandProzent();
	}
    
    public void IT1() {
		datenVerwaltung.NotAus();
	}
    
    public void IT2() {
		//NotAus in GrenzeErreicht aufgerufen
    	anzeigeVerwaltung.GrenzeErreicht();
    }
}
