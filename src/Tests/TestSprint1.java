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
    
    public void MT4() {
    	System.out.println("für Füllstand < maxFüllstand");
    	sensor.setFuellstand(5);
		anzeigeVerwaltung.stoerGrenzeErreicht();
		
		System.out.println("für Füllstand >= maxFüllstand");
		sensor.setFuellstand(55);
		anzeigeVerwaltung.stoerGrenzeErreicht();
	}
    
    public void MT3() {
		datenVerwaltung.getFuellstandProzent();
	}
    
    public void MT5() {
    	anzeigeVerwaltung.warnGrenzeErreicht();
    }
    
    public void MT6() {
    	sensor.stoppNotAus();
    }
    
    public void IT4() {
    	System.out.println("für Füllstand >= maxFüllstand");
		sensor.setFuellstand(55);
		anzeigeVerwaltung.stoerGrenzeErreicht();
		datenVerwaltung.NotAus();
	}
    
    public void IT6() {
    	System.out.println("für Füllstand < maxFüllstand");
    	sensor.setFuellstand(5);
		anzeigeVerwaltung.warnGrenzeErreicht();
		
		System.out.println("für Füllstand >= maxFüllstand");
		sensor.setFuellstand(55);
		anzeigeVerwaltung.warnGrenzeErreicht();
    }
}
