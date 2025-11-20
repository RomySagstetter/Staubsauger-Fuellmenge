# Sprint1
## Allgemeines

- [Vorbereitung für Sprint1](/docs/VorbereitungSprint1.md)
- IDE: eclipse (java)
- [Code für Sprint 1](/src)
<!-- - [verwendetes Tutorial für Singelton in Java](https://www.geeksforgeeks.org/java/singleton-class-java/)
- [verwendetes Tutorial für Java Swing](https://www.zum.de/Faecher/Inf/RP/Java/Dokumente/Java%20Tutorial%20%20Einfache%20GUI.htm)-->

## das ist neu

### Probleme
Während der Implementierung für den ersten Sprint haben sich in dem Softwaredesign ein paar Probleme hervorgehoben.

| **Problem**                                         | **Lösung**                                  
|-----------------------------------------------------|---------------------------------------
| fehlende Möglichkeit den NotStopp wieder zu beenden | `stoppNotAus()` in `DatenVerwaltung` und `Fuellstandsensor`
| Füllbeutel kann nicht gewechselt werden             | `FuellbeutelWechseln()` in `Anzeige`
| `showAnzeige`reicht nicht aus für sinnvolle Anzeige | um `Anzeige` nicht zu überladen wird das GUI in eine eigene Klasse `GUI` ausgealgert 

### UML mit den nötigen Änderungen

![](/docs/Graphiken/UMLImplementierung.png)


## Testfälle
[Testfälle](/docs/Testfaelle.md)

| **ID** | **Testfall** | **Definition** | **Abweichung von erwartetem Verhalten** 
|--------|--------------|----------------|----------------------------------------------------
| MT1    | Rückgabewert `NotAus()` | gibt `NotAus()` nach Aufruf den korrekten Wert zurück | 
| MT2    | Rückgabewert `GrenzeErreicht()` | gibt `GrenzeErreicht()` den richtigen Wert zurück | 
| MT3    | Rückgabewert `getFuellstandProzent()` | gibt `getFuellstandProzent()`den richtigen Wert zurück | 
| IT1    | Datenübermittlung `NotAus()` | wird der richtige Wert nach Aufruf von `NotAus()` an `DatenVerwaltung` übermittelt
| IT2    | `NotAus()` in `AnzeigeVerwaltung` | wird `NotAus()`nach Aufruf in `AnzeigeVerwaltung` korrekt ausgeführt
| IT3 | `FuellbeutelWechseln()` in `GUI` | wird `FuellbeutelWechseln()` nach Aufruf in `GUI` korrekt ausgeführt 

## Tracbility

[Tracability](/docs/Tracability.md)
