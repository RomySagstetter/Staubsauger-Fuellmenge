# Requirements: Füllmengenanzeige für Staubsauger
**Quelle: Quelle + Nummer**
- T: Teilfunktionalität
- L: Lastenheft
- P: Pflichtenheft

### funktionale Requirements

<table>
  <thead>
    <tr>
      <td>ID</td>
      <td>Titel</td>
      <td>Beschreibung</td>
      <td>Quelle</td>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>1.1</td>
      <td>automatische Füllstandsmessung</td>
      <td>Der Füllstand des Beutels wird zuverlässing gemessen</td>
      <td>T1</td>
    </tr>
    <tr>
      <td>1.2</td>
      <td>Füllstandsberechnung in Prozent</td>
      <td>Der Füllstand wird zuverlässig in Prozent umgerechnet</td>
      <td>T1</td>
    </tr>
    <tr>
      <td>2.1</td>
      <td>Anzeige aktueller Füllstand</td>
      <td>Füllstand wird bei Einschalten angezeigt</td>
      <td>P1</td>
    </tr>
    <tr>
      <td>2.2</td>
      <td>Anzeige wird automatisch aktualisiert</td>
      <td>Anzeige wird während der Nutzung automatisch aktualisiert</td>
      <td>P1</td>
    </tr>
    <tr>
      <td>3.1</td>
      <td>Warngrenze definieren</td>
      <td>Es wird eine feste Warngrenze im Bezug auf den prozentualen Füllstand festgelegt. Die Warngrenze liegt bei 90%</td>
      <td>P3</td>
    </tr>
    <tr>
      <td>3.2</td>
      <td>Störgrenze definieren</td>
      <td>Es wird eine Störgrenze bezüglich des Füllstnads auf 100% festgelegt</td>
      <td>P3</td>
    </tr>
    <tr>
      <td>4.1</td>
      <td>Warnung bei hohem Füllstand</td>
      <td>Bei Überschreitung des der Warngrenze gibt es ein visuelles Signal für den Nutzer</td>
      <td>L3</td>
    </tr>
    <tr>
      <td>4.2</td>
      <td>Warnung bei Erreichen der Störgrenze</td>
      <td>Bei Erreichen der Störgrenze gibt es ein visuelles Signal für den Nutzer</td>
      <td>L3</td>
    </tr>
    <tr>
    <tr>
      <td>5.1</td>
      <td>Schutz bei Erreichen der Störgrenze</td>
      <td>Gerätefunktion wird automatisch abgestellt. Gerät nicht nutzbar bis leerer Beutel eingestzt wird</td>
      <td>P7</td>
    </tr>
     <tr>
      <td>5.2</td>
      <td>wieder Freigabe des Systems</td>
      <td>Gerät wird nach Füllbeutelwechsel wieder nutzbar gemacht</td>
      <td></td>
    </tr>
  </tbody>
</table>

### nichtfunktionale Requirements

<table>
  <thead>
    <tr>
      <td>ID</td>
      <td>Titel</td>
      <td>Beschreibung</td>
      <td>Quelle</td>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>1.3</td>
      <td>keine zusätzliche Bedienung</td>
      <td>Die Füllstandserkennung erfordert keine zusätzliche Interaktion</td>
      <td>L2, P6</td>
    </tr>
    <tr>
      <td>2.3</td>
      <td>Anzeige bei längerer Nichtbenutzung</td>
      <td>Die Füllmengenanzeige funktioniert auch nach längerer Nichtnutzung zuverlässig</td>
      <td>L6, P5</td>
    </tr>
    <tr>
      <td>2.4</td>
      <td>intuitive Anzeige</td>
      <td>Die Füllmenge wird intuitiv und für den Nutzer leicht verständlich dargestellt</td>
      <td>L1, P1</td>
    </tr>
    <tr>
      <td>2.5</td>
      <td>angenehme Anzeige</td>
      <td>nicht zu helle und visuell unaufdringliche Anzeige</td>
      <td>L5, P6, P1</td>
    </tr>
    <tr>
      <td>2.6</td>
      <td>barrierefreie Anzeige (Sehschwache)</td>
      <td>Die Anzeige ist auch für Nutzer mit Sehschwäche lesbar</td>
      <td>L4, P4</td>
    </tr>
    <tr>
      <td>2.7</td>
      <td>barrierefreie Anzeige (Farbenblinde)</td>
      <td>Die Anzeige ist auch für Farbenblinde eindeutig erkennbar</td>
      <td>L4, P5</td>
    </tr>
    <tr>
      <td>2.8</td>
      <td>Anzeige ohne Verzögerung</td>
      <td>Die Aktualisierung der Anzeige erfolgt <1 Sekunde. Die Anzeige wird nach <1 Sekunde nach dem Einschalten des Geräts angezeigt</td>
      <td>P1</td>
    </tr>
    <tr>
      <td>2.9</td>
      <td>Sichtbarkeit während Nutzung</td>
      <td>Die Anzeige ist auch während der Nutzung sichtbar</td>
      <td>P4</td>
    </tr>
    <tr>
      <td>3.3</td>
      <td>Anzeigetoleranz</td>
      <td>Der angezeigte Füllstand muss mit einer Toleranz von ±5% gegenüber des realen Füllstands übereinstimmen</td>
      <td></td>
    </tr>
    <tr>
      <td>3.4</td>
      <td>Robustheit</td>
      <td>auch bei schlechten Bedingungen (siehe P5) bleibt die Anzeige zuverlässig</td>
      <td>P5</td>
    </tr>
    <tr>
      <td>4.3</td>
      <td>bemerkbare Warnung</td>
      <td>Die Warnsignale müssen auch während der Nutzung des Geräts wahrnehmbar sein (z.B. starke Geräuschkulisse)</td>
      <td></td>
    </tr>
    <tr>
      <td>6.1</td>
      <td>Energieeffizienz</td>
      <td>Die Füllstandsanzeige soll energieeffizient funktionieren</td>
      <td></td>
    </tr>
  </tbody>
</table>
