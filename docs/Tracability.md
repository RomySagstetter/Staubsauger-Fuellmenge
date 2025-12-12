# Tracability Matrix

| Requirement-ID | Komponente                                  | Klasse(n)                                           | Schnittstelle(n)                                                     | Testfall     | Sprint
|----------------|---------------------------------------------|-----------------------------------------------------|----------------------------------------------------------------------|--------------|---------
| 1.1            | Füllstandsensor                             | Füllstandsensor                                     | getFüllstand()                                                       |              | 1
| 1.2            | DatenVerwaltung                             | DatenVerwaltung                                     | getFuellstandProzent()                                               | MT3          | 1
| 1.3            | Anzeige                                     | 
| 2.1            | Anzeige                                     | GUI,Anzeige                                         | updateAnzeige(), FuellbeutelWechseln()                               | IT3          | 1
| 2.2            | Anzeige, Füllstandsensor                    | GUI, Füllstandsensor                                | GUI(), setFüllstand(inr füllstand), updateAnzeige()                  |              | 2
| 2.3            | Anzeige, Anzeigeverwaltung                  | 
| 2.4            | Anzeige                                     | Anzeige, GUI                                        | showAnzeige()                                                        |              | 1
| 2.5            | Anzeige                                     | 
| 2.6            | Anzeige                                     | 
| 2.7            | Anzeige                                     | 
| 2.8            | Anzeige, Füllstandsensor                    | GUI, Füllstandsensor                                | updateAnzeige()                                                      |              | 2
| 2.9            | Anzeige                                     | 
| 3.1            | AnzeigeVerwaltung                           | AnzeigeVerwaltung                                   | double warnGrenze                                                    | | 2
| 3.2            | AnzeigeVerwaltung                           | AnzeigeVerwaltung                                   | StörGrenze()                                                         | MT4          | 2
| 3.3            | AnzeigeVerwaltung                           | 
| 3.4            | Anzeige, AnzeigeVerwaltung, Füllstandsensor | 
| 4.1            | Anzeige                                     | Anzeige, GUI                                        | showAnzeige(), GUI(), WarngrenzeErreicht()                           | IT6 | 2
| 4.2            | Anzeige                                     | Anzeige, GUI                                        | showAnzeige()                                                        |               | 1
| 4.3            | Anzeige                                     | 
| 5.1            | Anzeige, AnzeigeVerwaltung, DatenVerwaltung | AnzeigeVerwaltung, DatenVerwaltung, Füllstandsensor | StörgrenzeErreicht(), DatenVerwaltung.NotAus(), Füllstandsensor.NotAus() | MT1, MT4, IT4 | 1, 2  
| 5.2            | Anzeige, Füllstandsensor                    | Anzeige, Füllstandsensor                            | stoppNotAus()                                                        | IT5           | 2
| 6.1            | Anzeige, AnzeigeVerwaltung                  | 
