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
| DatenVerwaltung      | Berechnung, Zustände, Fehler                          | Aufwertung der Daten für Anzeige
| Füllstandsensor      | Hardware-Interface, Sensorik, Ansteuerung, Robustheit | Zugriff auf Sensoren, Zugriff auf Display/LEDs, Füllstandsberechnung, 90/100%-Grenzen, Fehlerlogik, Echtzeit

### Zuordnung Requirements

| **Komponenten**     | **Requirements**
|---------------------|-----------------------------------------
| Anzeige             | 1.3, 2.1, 2.2, 2.4, 2.5, 2.6, 2.7, 2.9, 4.1, 4.2, 4.3, 5.2, 5.3, 6.1, 6.2
| fillLevelLogik      | 1.2, 2.2, 2.8, 3.1, 3.2, 3.3, 5.1, 6.1, 6.2
| hardwareAbstraction | 3.4, 7.1, 1.1, 3.3, 5.1, 6.1, 6.2
| persistanceManager  | 2.3

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
