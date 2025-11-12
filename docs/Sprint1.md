# Sprint1
## Allgemeines

- [Vorbereitung für Sprint1](/docs/VorbereitungSprint1)
- IDE: eclipse (java)
- [Code für Sprint 1](/src)
- [verwendetes Tutorial für Singelton in Java](https://www.geeksforgeeks.org/java/singleton-class-java/)
- [verwendetes Tutorial für JFrame](https://www.zum.de/Faecher/Inf/RP/Java/Dokumente/Java%20Tutorial%20%20Einfache%20GUI.htm)

## das ist neu

### Probleme
Während der Implementierung für den ersten Sprint haben sich in dem Softwaredesign ein paar Probleme hervorgehoben.

| **Problem**                                         | **Lösung**                                  
|-----------------------------------------------------|---------------------------------------
| fehlende Möglichkeit den NotStopp wieder zu beenden | `stoppNotAus()` in `DatenVerwaltung` und `Fuellstandsensor`
| Füllbeutel kann nicht gewechselt werden             | `FuellbeutelWechseln()` in `Anzeige`
| `showAnzeige`reicht nicht aus für sinnvolle Anzeige | um `Anzeige` nicht zu überladen wird das GUI in eine eigene Klasse `GUI` ausgealgert 

### UML mit den nötigen Änderungen

![](/docs/Graphiken/UML-Implementierung1.png)
