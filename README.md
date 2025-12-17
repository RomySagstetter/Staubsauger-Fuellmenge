# Anmerkungen

In Ihrer Bewertung schreiben Sie **"Es gilt erneut der Kommentar, dass in der Dokumentation (z.B. Sequenzdiagramm) keine Änderung / Anpassung vorgenommen wurde, obwohl Funktionalität hinzugekommen sein sollte. Einige der neu definierten Testfälle sind für Requirements geschrieben worden, die nicht in Sprint 3 neu realisiert werden sollten."** für die Übung 11.
Warum **"in der Dokumentation (z.B. Sequenzdiagramm) keine Änderung / Anpassung vorgenommen"** wurden habe ich bereits in der Dokumentation von [Sprint2](/docs/Sprint2/Sprint2.md) und im README.md genannt. Für [Sprint2](/docs/Sprint2/Sprint2.md) waren die letzten [funktionalen Requirements](/docs/Requirements.md) geplant, diese wurden umgesetzt und in den Diagrammen entsprechend ergänzt. Die neuen Funktionalitäten waren *"StörgrenzeErreicht()"* und *"WarngrenzeErreciht()"*, diese sind entstanden indem ich die Methode *"GrenzeErreicht()"* aus Sprint1 auf zwei genauer definierte Methoden aufgeteilt habe. Weitere [nicht-funktionale Requirements](/docs/Requirements.md) wurden ebenfalls umgesetzt, allerdings innerhalb bereits bestehender Funktionen, ich nehme an, dass daher dieses Missverständnis entstanden ist. Für Sprint3 waren nur noch die restlichen [nicht-funktionalen Requirements](/docs/Requirements.md) umzusetzten, diese wurden wie bereits oben erklärt in schon bestehenden Funktionen umgesetzt und haben folglich keine Modifikation der Diagramme erfordert. Die Klasse für den neuen Datentyp wurde im [UML-Diagramm](/docs/Graphiken/UMLSprint3.png) ergänzt, da diese Klasse aber nicht zu den Modulen ansich gehört und die Kommunikation zwischen den eigentlichen Modulen dadurch nicht beeinflusst wird, habe ich mich dazu entschieden die neue Klasse nicht in das Kommunikations- und Sequenzdiagramm einzutragen.
Bezüglich der [Testfälle](/Tests/TestfaelleSprint3.md) verstehe ich natürlich Ihre Kritik. Mein Gedanke war, da die neue Klasse nur als Datentyp fungiert ist es schwer Itegrationstests durchzuführen, daher habe ich mich dazu entschieden Schnittstellen ausßerhalb von [Sprint3](/docs/Sprint3/Sprint3.md) zu Testen. Ich habe zwei neue [Testfälle](/Tests/TestfaelleSprint3.md), *IT10* und *IT11*, hinzugefügt. Ich neheme an, dass sich dieser Kritikpunkt auf die Testfälle *IT9* und *IT8* bezieht. (Die Testfälle habe ich auch in [Sprint3](/docs/Sprint3/Sprint3.md) ergänzt, ebenso in der [Tracability-Matrix](/docs/Tracability.md))
Im Bezug auf Ihre Bewertung für [Sprint2](/docs/Sprint2/Sprint2.md): Sie schreiben hier **"Zwischen Sprint 1 und 2 hat sich an der Design Dokumentation kaum etwas geändert, obwohl FUnktionalität hinzugekommen sein sollte"**. wie ober bereits erklärt sind nur die funktionalen Requirements *"StörgrenzeErreicht()"* und *"WarngrenzeErreicht"* hinzugekommen, diese wurden in den Diagrammen entsprechend ergänzt. Alle [nicht-funktionalen Requirements](/docs/Requirements.md) wurden in bereits bestehenden Methoden umgesetzt und haben daher keine Anpassung an den Diagrammen erfordert.

# Staubsauger-Fuellmenge
****

## Übung vom 11.12.2025

**Anmerkung zu den Übungen vom 20.11.2025, 27.11.2025, 04.12 und 05.12.2025**

- die GitHub-Struktur wurde überarbeitet, der [Test-Ordner](/Tests) ist jetzt an der richtigen Stelle
- Für Sprint1 und 2 lag der Fokus auf den funktionalen Requirements, da es einfacher ist die restlichen nicht-funktionalen Requirements zusammen umzusetzten. Als Folge dessen hat sich bei Sprint2 nicht viel geändert, die neuen Funktionalitäten (StörgrenzeErreicht und WarngrenzeErreicht) wurden ergänzt.
- [Baseline für Sprint2](https://github.com/RomySagstetter/Staubsauger-Fuellmenge/releases/tag/v2)

**für die aktuelle Übung**

- [Sprint3](/docs/Sprint3/Sprint3.md)
- [Testfälle](/Tests/TestfaelleSprint3.md)
- [Tracability](/docs/Tracability.md)
- [Code](/src)
- [Baseline](https://github.com/RomySagstetter/Staubsauger-Fuellmenge/releases/tag/v3)

## Übung vom 04.12 und 05.12.2025

- [Sprint2](/docs/Sprint2/Sprint2.md)
- [Testfälle](/Tests/TestfaelleSprint2.md)
- [Tracability](/docs/Tracability.md)
- [Code](/src)

**Anmerkung**: die [Main](/src/Tests/Main1.java) Klasse um den Code auszuführen befindet sich im [Test Ordner](/src/Tests)

## Übung vom 27.11.2025

- [alle Dokumente für Sprint1](/docs/Sprint1)
- [Zusammenfassung Sprint1](/docs/Sprint1/Sprint1.md)
- [Tracability](/docs/Tracability.md)
- [Baseline](https://github.com/RomySagstetter/Staubsauger-Fuellmenge/releases/tag/v1)

## Übung vom 20.11.2025

- [Testfälle für Sprint1](/Tests/TestfaelleSprint1.md)
- [Zusammenfassung von Sprint1](/docs/Sprint1/Sprint1.md)
- [Tracability (jetzt auch mit Klasse `GUI`)](/docs/Tracability.md)
- [Code für Sprint 1](/src)

**Anmerkung**: die [Main](/src/Tests/Main1.java) Klasse um den Code auszuführen befindet sich im [Test Ordner](/src/Tests)

## Übung vom 13.11.2025 ✓

- IDE: eclipse (java)
- [Code für Sprint 1](/src)
<!-- - [verwendetes Tutorial für Singelton in Java](https://www.geeksforgeeks.org/java/singleton-class-java/)-->

*Anmerkung für Sprint2: AnzeigeVerwaltung auf Anzeige und DatenVerwaltung aufteilen*
- [Zusammenfassung von Sprint1](/docs/Sprint1/Sprint1.md)

🠖 überarbeitetes UML-Diagramm in Sprint1

## Übung vom 6.11.2025 ✓

- [Modulstrucktur](/src)
- Design Pattern: Singelton

 🠖 ändern des Klassendiagramms 
 
![](/docs/Graphiken/UMLSingelton.png)

## Übung vom 30.10.2025 ✓

- [Vorbereitung für Sprint 1](/docs/Sprint1/VorbereitungSprint1.md)
- [Tracability](/docs/Tracability.md)

## Übung vom 23.10.2025 ✓

- [Tracability](/docs/Tracability.md)
- [Architektur](/docs/Architektur.md)

## Übung vom 16.10.2025 ✓

- [Teilfunktionalitäten](/docs/Teilfunktionalitaeten.md)
- [Requirements](/docs/Requirements.md)
- [Lastenheft](/docs/Lastenheft.md)
- [Pflichtenheft](/docs/Pflichtenheft.md)
