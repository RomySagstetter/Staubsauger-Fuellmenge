# Testfälle

<ins>Ein Testfall ist dadurch charakterisiert, dass</ins>
- Die <ins>Vorbedingung</ins> angegeben wird. Dies kann ein Systemzustand sein oder die
Notwendigkeit, dass ein bestimmtes Objekt existiert und lediglich initialisiert wurde, etc.
- Die <ins>Aktion</ins> beschrieben wird, die ausgeführt werden soll.
- Die erwartete <ins>Reaktion</ins> bzw. das Ergebnis beschrieben wird.
- Die <ins>Nachbedingung</ins> beschrieben wird, die nach Ausführung des Testfalls herrschen soll.

## auf Modulebene
### 1. NotAus Rückgabe
- **Vorbedingung**: maximaler Füllstand erreicht
- **Aktion**: `NotAus()` wird aufgerufen
- **Reaktion**: `NotAus()` gibt den Wert `true` zurück
- **Nachbedingung**: Staubsaugefunktion (bzw. System) soll pausiert werden
- geprüft über Konsolenausgabe, Aufruf in `TestSprint1`

### 2. GrenzeErreicht Rückgabe
- **Vorbedingung**: Füllmenge wurde an `AnzeigeVerwaltung` übermittelt
- **Aktion**: `GrenzeErreicht()`wird augerufen
- **Reaktion**: `GrenzeErreicht()` gibt true bei maximaler Füllmenge und flase bei nicht maximaler Füllmenge aus
- **Nachbedingung**: `NotAus()` wird aufegrufen
- geprüft über Konsolenausgabe, Aufruf in `TestSprint1`


### 3. Füllstand in Prozent Rückgabe
- **Vorbedingung**: Füllstand wurde an `DatenVerwaltung` übermittelt
- **Aktion**: `getFuellstandProzent()` wird aufgerufen
- **Reaktion**: `getFuellstandProzent()` gibt den aktuellen Füllstand in Prozent aus
- **Nachbedingung**: zurückgegebener Wert kann für Anzeige und `GrenzeErreicht()` verwendet werden
- geprüft über Konsolenausgabe, Aufruf in `TestSprint1`

## auf Integrationsebene
### 1. NotAus Rückgabe
- **Vorbedingung**: `NotAus()` wurde aufgerufen
- **Aktion**: `NotAus()` gibt bool Wert zurück an `DatenVerwaltung`
- **Reaktion**: Wert wird an AnzeigeVerwaltung übermittelt
- **Nachbedingung**: Staubsaugefunktion (bzw. System) soll pausiert werden, entsprechende Anzeige soll geschalten werden
- geprüft über Konsolenausgabe, Aufruf in `TestSprint1`


### 2. NotAus durchführen
- **Vorbedingung**: Störgrenze wurde erreicht
- **Aktion**: `NotAus()` wird in `AnzeigeVerwaltung` aufgerufen
- **Reaktion**: `NotAus()` wird in `Füllstandsensor` durchgeführt
- **Nachbedingung**: Staubsaugefunktion (bzw. System) soll pausiert werden, entsprechende Anzeige soll geschalten werden
- geprüft über Konsolenausgabe, Aufruf in `TestSprint1`


### 3. Datenübermittlung von FüllbeutelWechseln-Button
- **Vorbedingung**: Button wurde gedrückt
- **Aktion**: `FuellbeutelWechseln()` wird in `GUI` aufgerufen
- **Reaktion**: `FuellbeutelWechseln()` wird ausgeführt
- **Nachbedingung**: Füllstand wird auf null zurückgesetzt
- geprüft über Konsolenausgabe nachdem der Button gedrückt wurde

🠖 Testfälle aus `TestSprint1` werden in `Main1` aufgerufen

🠖 zusätzlich Testmöglichkeit über Anzeige selbst und Nachricht in Anzeige

## Code für Tests

[Code Sprint1](/src)

## [Tracbility-Matrix](/docs/Tracability.md)

[Tracbility-Matrix](/docs/Tracability.md)

## Dokumentation in Sprint1

[Sprint1](/docs/Sprint1/Sprint1.md)
