# Sprint2

## Allgemeines

- IDE: eclipse (java)
- [Code für Sprint2](/src)

## Requirements

- 2.2 Füllstand wird automatisch aktualisiert
- 3.1 Warngrenze definieren
- 4.1 Warnung bei hohem Füllstand
- 2.8 Anzeige ohne Verzögerung

## Tracability

[Tracabillity-Matrix](/docs/Tracability.md)

## Diagramme

### UML-Diagramm

![UML](/docs/Graphiken/UMLSprint2.png)

### Sequenzdiagramm

![Sequenz](/docs/Graphiken/SequenzdiagrammSprint2.png)

### Kommunikationsdiagramm

![Kommunikation](/docs/Graphiken/KommunikationsdiagrammSprint2.png)

## Testfälle
[Testfälle](/Tests/TestfaelleSprint2.md)

| **ID** | **Testfall**                          | **Definition**                                                                       | **Abweichung von erwartetem Verhalten** 
|--------|---------------------------------------|--------------------------------------------------------------------------------------|----------------------------------------------------
| MT1    | Rückgabewert `NotAus()`               | gibt `NotAus()` nach Aufruf den korrekten Wert zurück                                | keine Abweichung, Konsolenausgabe wie erwartet
| ~MT2~  |~Rückgabewert `GrenzeErreicht()`~      |~gibt `GrenzeErreicht()` den richtigen Wert zurück~                                   |~keine Abweichung, Konsolenausgabe wie erwartet~
| MT3    | Rückgabewert `getFuellstandProzent()` | gibt `getFuellstandProzent()`den richtigen Wert zurück                               | keine Abweichung, Konsolenausgabe wie erwartet
| MT4    | Rückgabewert Störgrenze               | gibt `StörgrenzeErreicht()` den richtigen Wert zurück                                | keine Abweichung, Konsolenausgabe wie erwartet
| MT5    | Rückgabewert Warnrgrenze              | gibt `WarngrenzeErreicht()` den richtigen Wert zurück                                | keine Abweichung, Konsolenausgabe wie erwartet
| MT6    | Rückgabewert `stoppNotAus()`          | gibt `stoppNotAus()` nach Aufruf den korrekten Wert zurück                           | keine Abweichung, Konsolenausgabe wie erwartet
| ~IT1~  | ~Datenübermittlung `NotAus()`~        | ~wird der richtige Wert nach Aufruf von `NotAus()` an `DatenVerwaltung` übermittelt~ | ~keine Abweichung, Konsolenausgabe wie erwartet~
| ~IT2~  | ~`NotAus()` in `AnzeigeVerwaltung`~   | ~wird `NotAus()`nach Aufruf in `AnzeigeVerwaltung` korrekt ausgeführt~               | ~keine Abweichung, Konsolenausgabe wie erwartet~
| IT3    | `FuellbeutelWechseln()` in `GUI`      | wird `FuellbeutelWechseln()` nach Aufruf in `GUI` korrekt ausgeführt                 | keine Abweichung, Konsolenausgabe wie erwartet
| IT4    | `NotAus()` durchführen                | wird `NotAus()`nach Aufruf in `AnzeigeVerwaltung` korrekt ausgeführt                 | keine Abweichung, Konsolenausgabe wie erwartet
| IT5    | `stoppNotAus()` durchführen           | wird `stoppNotAus()`nach Aufruf in `AnzeigeVerwaltung` korrekt ausgeführt            | keine Abweichung, Konsolenausgabe wie erwartet
| IT6    | Übermittlung `WarngrenzeErreicht()`   | gibt `WarngrenzeErreicht()` den richtigen Wert an GUI zurück                         | keine Anweichung, Konsolenausgabe und Anzeige (orange Farbe des Füllwerts) wie erwartet

**Achtung** bitte Inweise in [Testfälle](/Tests/TestfaelleSprint2.md) beachten

- IT5 wird über Anzeige und daraus folgenden Konsolenausgaben geprüft

## Retrospevtive

| **Problem**    | **Lösung**  
|----------------|------------------------

## Baseline
