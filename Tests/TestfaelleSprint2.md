# Testfälle

<ins>Ein Testfall ist dadurch charakterisiert, dass</ins>
- Die <ins>Vorbedingung</ins> angegeben wird. Dies kann ein Systemzustand sein oder die
Notwendigkeit, dass ein bestimmtes Objekt existiert und lediglich initialisiert wurde, etc.
- Die <ins>Aktion</ins> beschrieben wird, die ausgeführt werden soll.
- Die erwartete <ins>Reaktion</ins> bzw. das Ergebnis beschrieben wird.
- Die <ins>Nachbedingung</ins> beschrieben wird, die nach Ausführung des Testfalls herrschen soll.

## auf Modulebene

| **ID** | **Testfall**                          | **Vorbedingung**                                 | **Aktion**                                                           | **Reaktion**                                                         | **Nachbedingung**
|--------|---------------------------------------|--------------------------------------------------|----------------------------------------------------------------------|----------------------------------------------------------------------|--------------------
| MT1    | Rückgabewert `NotAus()`               | maximaler Füllstand erreicht                     | `NotAus()` wird aufgerufen                                           | `NotAus()` gibt den Wert true zurück                                 | Staubsaugefunktion (bzw. System) soll pausiert werden
| MT3    | Rückgabewert `getFuellstandProzent()` | Füllstand wurde an `DatenVerwaltung` übermittelt |`getFuellstandProzent()` wird aufgerufen                              | `getFuellstandProzent()` gibt den aktuellen Füllstand in Prozent aus | zurückgegebener Wert kann für Anzeige und `GrenzeErreicht()` verwendet werden
| MT4    | Rückgabewert Störgrenze               | Störgenze erreicht                               | `StörgrenzeErreicht()` wird aufgerufen                               | `StörgrenzeErreicht()` gibt *`true`* zurück                          | `NotAus()`soll aufgerufen werden
| MT5    | Rückgabewert Warnrgrenze              | Warngrenze erreicht                              | `WarngrenzeErreicht()` wird aufgerufen                               | `WarngrenzeErreicht()` gibt *`true`* zurück                          | das Erreichen der Warngrenze soll auf der Anzeige sichtbar gemacht werden
| MT6    | Rückgabewert `stoppNotAus()`          | ´FüllbeutelWechseln()` wurde aufgerufen          | `stoppNotAus()` wird aufgerufen                                      | `stoppNotAus()` gibt *`false`* aus                                   | `Füllstand` wir auf 0 gesetzt und Systemfunktionen freigegeben

## auf Integrationsebene

| **ID** | **Testfall**                        | **Vorbedingung**                       | **Aktion**                                        | **Reaktion**                                           | **Nachbedingung**
|--------|-------------------------------------|----------------------------------------|---------------------------------------------------|--------------------------------------------------------|--------------------
| IT3    | `FuellbeutelWechseln()` in `GUI`    | Button wurde gedrückt                  | `FuellbeutelWechseln()` wird in `GUI` aufgerufen  | `FuellbeutelWechseln()` wird ausgeführt                | Füllstand wird auf null zurückgesetzt
| IT4    | `NotAus()` durchführen              | Störgrenze wurde erreicht              | `NotAus()` wird in `AnzeigeVerwaltung` aufgerufen | `NotAus()` wird in `Füllstandsensor` durchgeführt      | Staubsaugefunktion (bzw. System) soll pausiert werden, entsprechende Anzeige soll geschalten werden
| IT5    | `stoppNotAus()` durchführen         | FüllbeutelWechseln()` wurde aufgerufen | `stoppNotAus()` wird in `Anzeige` aufgerufen      | `stoppNotAus()` wird in `Füllstandsensor` durchgeführt | `Füllstand` wir auf 0 gesetzt und Systemfunktionen freigegeben, Anzeige wird aktualisiert
| IT6    | Übermittlung `WarngrenzeErreicht()` | Warngrenze wurde erreicht              | `WarngrenzeErreicht()` wird in GUI aufgerufen     | `WarngrenzeErreicht()` gibt *`true`* zurück            | Erreichen der Warngrenze wird auf der Anzeige kenntlich gemacht

### Anmerkungen

- die Tests IT1 und IT2 können auf Grund veränderter Softwarestrucktur nicht mehr durchgeführt werden, sie wurden teilweise durch IT4 ersetzt
- der Test MT2 kann auf Grund veränderter Softwarestrucktur nicht mehr durchgeführt werden, er wurde teilweise durch MT4 ersetzt
- alle Tests werden entweder über Konsolenausgabe oder durch die Anzeige selbst geprüft

## Code für Tests

[Code Sprint2](/src)

## [Tracbility-Matrix](/docs/Tracability.md)

[Tracbility-Matrix](/docs/Tracability.md)
