# Sprint1
## Allgemeines

- [Vorbereitung für Sprint1](/docs/VorbereitungSprint1)
- IDE: eclipse (java)
- [Code für Sprint 1](/src)
- [verwendetes Tutorial für Singelton in Java](https://www.geeksforgeeks.org/java/singleton-class-java/)

## das ist neu

### Probleme
Während der Implementierung für den ersten Sprint haben sich in dem Softwaredesign ein paar Probleme hervorgehoben.

| **Problem**                                         | **Lösung**                                  
|-----------------------------------------------------|---------------------------------------
| fehlende Möglichkeit den NotStopp wieder zu beenden | `stoppNotAus()` in `DatenVerwaltung` und `Fuellstandsensor`
| Füllbeutel kann nicht gewechselt werden             | `FuellbeutelWechseln()` in `Anzeige`

### UML mit den nötigen Änderungen

![](/docs/Graphiken/UML-Implementierung1.png)
