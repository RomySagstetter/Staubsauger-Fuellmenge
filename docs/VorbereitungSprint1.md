# Vorbereitung Sprint 1

### Requirenments

**für den ersten Sprint nur die nötigsten Requirements**

- 1.2 Füllstandberechnung in Prozent
- 2.1 Anzeige aktueller Füllstand
- 2.4 Warnung bei Erreichen der Störgrenze
- 3.2 Störgrenze definieren
- 4.2 Warnung bei Erreichen der Störgrenze
- 5.1 Schutz bei Erreichen der Störgrenze

Die ausgewählten Requirements umfassen nur die aller nötigsten für eine funktionierende Anzeige

## Software Design Komponenten

### Füllstandsensor

**Attribute**
- Sensordaten{ Füllstand, maxFüllstand }

**Methoden**
- bool NotAus()
- Sensordaten getSensordaten()

### DatenVerwaltung

**Attribute**
- Füllstandsensor Sensor
- AnzeigeVerwaltung anzeigeVerwaltung

**Methoden**
- int Füllstand(Sensor.getSensordaten())
- void NotAus(anzeigeVerwaltung.GrenzeErreicht()) -> Nutz NotAus von wartet auf Antwort

### AnzeigeVerwaltung

**Attribute**
- DatenVerwaltung datenVerwaltung

**Methoden**
- bool GrenzeErreicht(datenVerwaltung.Füllstand())

### Anzeige

**Attribute**
- AnzeigeVerwaltung anzeigeVerwaltung

**Methoden**
- void showAnzeige(anzeigeVerwaltung.GrenzeErreicht())

## [Tracability](/docs/Tracability.md)

[Tracability-Matrix](/docs/Tracability.md)

## Diagramme

### Klassendiagramm / UML

![UML](/docs/Graphiken/UMLneu.png)

### Sequenzdiagramm

![Squenzdiagramm](/docs/Graphiken/SequenzdiagrammNeu.png)

### Kommunikationsdiagramm

![Kommunikationsdiagramm](/docs/Graphiken/Kommunikationsdiagramm.png)
