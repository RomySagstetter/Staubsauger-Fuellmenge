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
		anzeigeVerwaltung.GrenzeErreicht();
	}
    
    public void MT3() {
		datenVerwaltung.getFuellstandProzent();
	}
    
    public void IT1() {
		datenVerwaltung.NotAus();
	}
    
    public void IT2() {
    	anzeigeVerwaltung.GrenzeErreicht();
    }
}
