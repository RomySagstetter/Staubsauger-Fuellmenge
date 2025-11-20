# Tracability Matrix

| Requirement-ID | Komponente                         | Klasse(n)                                          | Schnittstelle(n)                                            | Testfall     | Sprint
|----------------|------------------------------------|----------------------------------------------------|-------------------------------------------------------------|--------------|---------
| 1.1 | Füllstandsensor | | 
| 1.2 | DatenVerwaltung | DatenVerwaltung | Füllstand(Sensor.getSensordaten()) | | 1
| 1.3 | Anzeige         | |
| 2.1 | Anzeige         | GUI | updateAnzeige() | | 1
| 2.2 | Anzeige, AnzeigeVerwaltung | | 
| 2.3 | Anzeige, Anzeigeverwaltung | | 
| 2.4 | Anzeige         | Anzeige | showAnzeige(anzeigeVerwaltung.GrenzeErreicht() | | 1
| 2.5 | Anzeige         | |
| 2.6 | Anzeige         | | 
| 2.7 | Anzeige         | | 
| 2.8 | Anzeige, AnzeigeVerwaltung | | 
| 2.9 | Anzeige         | | 
| 3.1 | AnzeigeVerwaltung | | 
| 3.2 | AnzeigeVerwaltung | AnzeigeVerwaltung | GrenzeErreicht() | | 1
| 3.3 | AnzeigeVerwaltung | | 
| 3.4 | Anzeige, AnzeigeVerwaltung, Füllstandsensor | | 
| 4.1 | Anzeige           | | 
| 4.2 | Anzeige           | Anzeige | showAnzeige(anzeigeVerwaltung.GrenzeErreicht() | | 1
| 4.3 | Anzeige           | | 
| 5.1 | Anzeige, AnzeigeVerwaltung, DatenVerwaltung | AnzeigeVerwaltung, DatenVerwaltung, Füllstandsensor | GrenzeErreicht(datenVerwaltung.Füllstand()), NotAus(anzeigeVerwaltung.GrenzeErreicht(), NotAus() | | 1  
| 6.1 | Anzeige, AnzeigeVerwaltung | | 
