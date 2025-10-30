# Architektur

## Software Architektur

![SoftwareKomponenten](/docs/Graphiken/Komponenten.jpg)

### Unterteilung in vier Schichten

- Füllstandsensor
- DatenVerwaltung
- AnzeigeVerwaltung
- Anzeige

### Beschreibung

| **Komponente**       | **Rolle**                                             | **Verantwortlichkeiten**
|----------------------|-------------------------------------------------------|---------------------------------------------------------------------------------
| Anzeige              | Präsentationsschicht, Darstellung, Barrierefreiheit   | Eindeutige Anzeige, Barrierefreiheit, User-Interaktion, Warnung, Helligkeit
| AnzeigeVerwaltung    | Kommunikation zwischen DatenVerwaltung und Anzeige    | Aufwertung der Daten für Anzeige
| DatenVerwaltung      | Hardware-Interface, Ansteuerung, Robustheit, Berechnung, Zustände, Fehler  | Zugriff auf Sensoren, Füllstandsberechnung, 90/100%-Grenzen, Fehlerlogik, Echtzeit
| Füllstandsensor      | Sensorik                                              | Übermittlung Sensordaten

### Zuordnung Requirements

| **Komponenten**     | **Requirements**
|---------------------|-----------------------------------------
| Anzeige             | 1.3, 2.1, 2.2, 2.3, 2.4, 2.5, 2.6, 2.7, 2.8, 2.9, 3.4, 4.1, 4.2, 
| AnzeigeVerwaltung   | 2.2, 2.3, 2.8, 3.1, 3.2, 3.3, 3.4, 
| DatenVerwaltung     | 1.2, 5.1, 
| Füllstandsensor     | 1.1, 3.4, 

## Schnittstellen

| **Ziel**              | **Quelle**             | **Schnittstellen**
|-----------------------|------------------------|---------------------------
| `userInterface`       | `fillLevelLogik`       | fillLevelPercent(), crossBoundary(), errorCode(), UpdateDisplay(fillLevelPercent(), crossBoundary(), errorCode()), showMessage(text, type)
| `fillLevelLogik`      | `hardwareAbstraction`  | GetPressure(), GetBagStatus(), SensorDataUpdated()
| `persistance Manager` | `fillLevelLogik`       | LoadCalibrationData(), SaveCalibrationData(), LoadThresholds(), SaveThresholds()
| `persistenceManager`  | `hardwareAbstraction`  | ReadMemory(address), WriteMemory(address, value), SystemInit()
| `fillLevelLogik`      | `fillLevelLogik`       | ComputeFillLevel(pressure), CheckThresholds(fillPercent), DetectError(bagStatus)

### Beschreibung der Schnittstellen

[Schnittstellendokumentation](/docs/SchnittstellenDoc.md)
