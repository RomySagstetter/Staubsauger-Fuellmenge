# Testfälle

<ins>Ein Testfall ist dadurch charakterisiert, dass</ins>
- Die Vorbedingung angegeben wird. Dies kann ein Systemzustand sein oder die
Notwendigkeit, dass ein bestimmtes Objekt existiert und lediglich initialisiert wurde, etc.
- Die Aktion beschrieben wird, die ausgeführt werden soll.
- Die erwartete Reaktion bzw. das Ergebnis beschrieben wird.
- Die Nachbedingung beschrieben wird, die nach Ausführung des Testfalls herrschen soll.

## auf Modulebene
### 1. NotAus Rückgabe
- gibt NotAus() den richtigen Wert zurück


### 2. GrenzeErreicht Rückgabe
- gibt Grenze erreicht den Richtigen Wert aus


### 3. Füllstand in Prozent Rückgabe
- gibt FüllstandProzent den richtigen Wert aus

## auf Integrationsebene
### 1. NotAus Rückgabe
- übergibt NotAus() den richtigen Wert an DatenVerwaltung


### 2. NotAus durchführen
- wird NotAu() nach Aufruf in AnzeigeVerwaltung richtig ausgeführt


### 3. Datenübermittlung von saugen-Button
- wird FüllbeutelWechseln() Aufruf in GUI richtig ausgeführt


## [Tracbility-Matrix](/docs/Tracability.md)

[Tracbility-Matrix](/docs/Tracability.md)

## Dokumentation in Sprint1

[Sprint1](/docs/Sprint1.md)
