# Sprint3

## Allgemeines

- IDE: eclipse (java)
- [Code für Sprint3](/src)

## Requirements

- 1.3 keine zusätzliche Bedienung
- 2.3 Anzeige bei längerer Nichtbenutzung
- 2.5 angenehme Anzeige
- 2.6 barrierefreie Anzeige (Sehschwache)
- 2.7 barrierefreie Anzeige (Farbenblinde)
- 2.9 Sichtbarkeit während Nutzung
- 3.3 Anzeigetoleranz
- 3.4 Robustheit
- 4.3 bemerkbare Warnung
- 6.1 Energieeffizienz

### Umsetzung der Requirements

nur falls zusätzliche Überlegungen unternommen wurden

- 1.3 die Anzeige benötigt nur das Minimum an Bedienung, saugen und Beutel wechsel, alseo keine zusätzlichen Funktionen zu den gängigen Staubsaugerfunktionen
- 2.5 umgesetzt durch schlichte, optisch nicht überfordernde Anzeige
- 2.6 Schrift auf Buttons vergößern
- 2.7 schwarze Umrandung bei Erreichen der Warngrenze, Entfernung des Saugen Buttens, wenn Störgrenze erreicht -> Erreichen ist eindeutig
- 2.9 Inhalt von Anzeige ist bereits gut sichtbar, Sichtbarkeit der während Nutzung hängt nun nurnoch von Plazierung auf Gerät ab
- 4.3 das Warnsignal wird durch die Anzeige des Füllstands übernommen und ist somit während der Nutzung und auch bei staker Geräuschkulisse warnehmbar

## Tracability

[Tracabillity-Matrix](/docs/Tracability.md)

## Diagramme

![UML](/docs/Graphiken/UMLSprint3.png)

### Sequenzdiagramm

![Sequenz](/docs/Graphiken/SequenzdiagrammSprint2.png)

### Kommunikationsdiagramm

![Kommunikation](/docs/Graphiken/KommunikationsdiagrammSprint2.png)

## Testfälle
[Testfälle](/Tests/TestfaelleSprint3.md)

| **ID** | **Testfall**                                       | **Definition**                                                                       | **Abweichung von erwartetem Verhalten** 
|--------|----------------------------------------------------|--------------------------------------------------------------------------------------|----------------------------------------------------
| MT1    | Rückgabewert `NotAus()`                            | gibt `NotAus()` nach Aufruf den korrekten Wert zurück                                | keine Abweichung, Konsolenausgabe wie erwartet
| ~MT2~  |~Rückgabewert `GrenzeErreicht()`~                   |~gibt `GrenzeErreicht()` den richtigen Wert zurück~                                   |~keine Abweichung, Konsolenausgabe wie erwartet~
| MT3    | Rückgabewert `getFuellstandProzent()`              | gibt `getFuellstandProzent()`den richtigen Wert zurück                               | keine Abweichung, Konsolenausgabe wie erwartet
| MT4    | Rückgabewert Störgrenze                            | gibt `StörgrenzeErreicht()` den richtigen Wert zurück                                | keine Abweichung, Konsolenausgabe wie erwartet
| MT5    | Rückgabewert Warnrgrenze                           | gibt `WarngrenzeErreicht()` den richtigen Wert zurück                                | keine Abweichung, Konsolenausgabe wie erwartet
| MT6    | Rückgabewert `stoppNotAus()`                       | gibt `stoppNotAus()` nach Aufruf den korrekten Wert zurück                           | keine Abweichung, Konsolenausgabe wie erwartet
| MT7    | funktioniert `setColor()`                          | ändert sich die Textfarbe                                                            | keine Abweichung, die anzeige ändert sich wie erwartet
| MT8    | funktioniert `setTextSize()`                       | ändert sich die Schriftgröße                                                         | keine Abweichung, die anzeige ändert sich wie erwartet
| MT9    | funktioniert `setoutlineEnable()`                  | wird der Text umrandet                                                               | keine Abweichung, die anzeige ändert sich wie erwartet
| ~IT1~  | ~Datenübermittlung `NotAus()`~                     | ~wird der richtige Wert nach Aufruf von `NotAus()` an `DatenVerwaltung` übermittelt~ | ~keine Abweichung, Konsolenausgabe wie erwartet~
| ~IT2~  | ~`NotAus()` in `AnzeigeVerwaltung`~                | ~wird `NotAus()`nach Aufruf in `AnzeigeVerwaltung` korrekt ausgeführt~               | ~keine Abweichung, Konsolenausgabe wie erwartet~
| IT3    | `FuellbeutelWechseln()` in `GUI`                   | wird `FuellbeutelWechseln()` nach Aufruf in `GUI` korrekt ausgeführt                 | keine Abweichung, Konsolenausgabe wie erwartet
| IT4    | `NotAus()` durchführen                             | wird `NotAus()`nach Aufruf in `AnzeigeVerwaltung` korrekt ausgeführt                 | keine Abweichung, Konsolenausgabe wie erwartet
| IT5    | `stoppNotAus()` durchführen                        | wird `stoppNotAus()`nach Aufruf in `AnzeigeVerwaltung` korrekt ausgeführt            | keine Abweichung, Konsolenausgabe wie erwartet
| IT6    | Übermittlung `WarngrenzeErreicht()`                | gibt `WarngrenzeErreicht()` den richtigen Wert an GUI zurück                         | keine Anweichung, Konsolenausgabe und Anzeige (orange Farbe des Füllwerts) wie erwartet
| IT7    | umrandet `TextOutline` den Text in `GUI`           | wird Text vom Typ `TextOutline` unrandet                                             | es sind Probleme bei der Ausführung des Programms aufgetreten
| IT8    | `FüllbeutelWechseln()` nach `StörgrenzeErreicht()` | wird Füllbeutel korrekt gewechselt                                                   | Füllmengeanzeige läuft nach Wechsel ohne Knopfdruck weiter
| IT9    | Rückgabewert `getMaxFüllstand()`                   | Übermittelt `getMaxFüllstand()`den richtigen Wert                                    | keine Abweichung, Konsolenausgabe wie erwartet


**Achtung** bitte Hinweise in [Testfälle](/Tests/TestfaelleSprint3.md) beachten

- IT5 wird über Anzeige und daraus folgenden Konsolenausgaben geprüft

### Probleme

| **ID** | **Problem**                                     | **Lösung**
|--------|-------------------------------------------------|-------------------------------------------------------
| IT7    | Fehler nach Aufruf von `TextOutline`            | Satzzeichenfehler in `TextOutline` wurde behoben
| IT8    | Füllmengeanzeige läuft ohne Aufforderung weiter | `saugTimer.stop()` im ActionListener des Buttons aufgerufen, Timer läauft jetzt nach `FüllbeutelWechseln()` nicht mehr ohne Knopfdruck weiter
|        | Umrandung der Schrift benötigt extra Klasse     | `TextOutline`

## Retrospevtive

- für die Umrandung des Füllstands musste eine neue Klasse `TextOutline eingeführt werden
  -> `TextOutline´ hatte keine Auswirkung auf den Zeitlichenablauf des Programms
- es trat ein Fehler während der Implementierung von `TextOutline`auf, dieser wurde behoben
- es trat ein Fehler nach der Implementierung `TextOutline` von auf, dieser wurde behoben
- die Diagramme wurden angepasst
- Kommunikation- und Sequenzdiagramm mussten nicht angepasst werden, da die neue Klasse als Datentyp fungiert

## Baseline

Stand nach Sprint3: [v3](https://github.com/RomySagstetter/Staubsauger-Fuellmenge/releases/tag/v3)
