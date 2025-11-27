# Sprint1
## Allgemeines

- [Vorbereitung für Sprint1](/docs/Sprint1/VorbereitungSprint1.md)
- IDE: eclipse (java)
- [Code für Sprint 1](/src)

## Testfälle
[Testfälle](/docs/Testfaelle.md)

| **ID** | **Testfall** | **Definition** | **Abweichung von erwartetem Verhalten** 
|--------|--------------|----------------|----------------------------------------------------
| MT1    | Rückgabewert `NotAus()` | gibt `NotAus()` nach Aufruf den korrekten Wert zurück | keine Abweichung, Konsolenausgabe wie erwartet
| MT2    | Rückgabewert `GrenzeErreicht()` | gibt `GrenzeErreicht()` den richtigen Wert zurück | keine Abweichung, Konsolenausgabe wie erwartet
| MT3    | Rückgabewert `getFuellstandProzent()` | gibt `getFuellstandProzent()`den richtigen Wert zurück | keine Abweichung, Konsolenausgabe wie erwartet
| IT1    | Datenübermittlung `NotAus()` | wird der richtige Wert nach Aufruf von `NotAus()` an `DatenVerwaltung` übermittelt | keine Abweichung, Konsolenausgabe wie erwartet
| IT2    | `NotAus()` in `AnzeigeVerwaltung` | wird `NotAus()`nach Aufruf in `AnzeigeVerwaltung` korrekt ausgeführt | keine Abweichung, Konsolenausgabe wie erwartet
| IT3    | `FuellbeutelWechseln()` in `GUI` | wird `FuellbeutelWechseln()` nach Aufruf in `GUI` korrekt ausgeführt | keine Abweichung, Konsolenausgabe wie erwartet

## Tracbility

[Tracability](/docs/Tracability.md)

## Retrospective - das ist neu

### Probleme
Während der Implementierung für den ersten Sprint haben sich in dem Softwaredesign ein paar Probleme hervorgehoben.

| **Problem**                                         | **Lösung**                                  
|-----------------------------------------------------|---------------------------------------
| fehlende Möglichkeit den NotStopp wieder zu beenden | `stoppNotAus()` in `DatenVerwaltung` und `Fuellstandsensor`
| Füllbeutel kann nicht gewechselt werden             | `FuellbeutelWechseln()` in `Anzeige`
| `showAnzeige`reicht nicht aus für sinnvolle Anzeige | um `Anzeige` nicht zu überladen wird das GUI in eine eigene Klasse `GUI` ausgealgert 

### UML mit den nötigen Änderungen

![UML](/docs/Graphiken/UMLSprint1.png)

### Sequenzdiagramm mit nötigen Änderungen

![Sequenz](/docs/Graphiken/SequenzdiagrammSprint1.png)

### Kommunikationsdiagramm mit nötigen Änderungen

![Kommunikation](/docs/Graphiken/KommunikationsdiagrammSprint1.png)

### Baseline

- alle für Sprint1 angesetzten Requirements wurden umgesetzt
- auftretende Probleme würden im Verlauf von Sprint1 behoben
- neue Objekte und Klassen wurden im UML-Diagramm aktualisiert
- Sequenz- und Kommunikationsdigramm wurden überarbeitet
- die Tracability-Matrix wurde an die neue Software-Architektur angepasst
- alle Tests waren erfolgreich

### Änderungen für Sprint2

- im Moment sind für Sprint2 keine Anpassungen an der Software-Architektur vorgesehen
- Umsetzung weiterer Requirements
