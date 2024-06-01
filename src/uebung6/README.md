Aufgabe1.1:
TODO #1: Akteure: Unternehmer

TODO #2:
Alternativer Ereignisfluss Nr.1:
1. Das System öffnet einen Dialog, wo die ungültigen Eingaben von der Beschreibung angezeigt werden.
2. Das System fordert den Unternehmer auf die fehlerhaften Eingaben zu korrigieren.
3. Unternehmer gibt Daten erneut ein und bestätigt die Eingabe.
4. gehen zu Schritt 5

TODO #3:\
Use Case: Bankdaten ermitteln \
System: NullPointer Collaboration Portal \
Akteure: Unternehmer \
Vorbedingung:
- Registrierter Unternehmer hat sich im System eingeloggt (Use Case: Login eines
  registrierten Benutzers).

Regulärer Ereignisfluss:
1. System überprüft, ob Bankdaten des Unternehmers bereits im System hinterlegt sind.
2. System zeigt alle hinterlegten Bankdaten an und es existiert ein Button, um neue Bankdaten hinzuzufügen.

Alternativer Ereignisfluss Nr.1:
1. System zeigt eine Fehlermeldung, dass keine Bankdaten hinterlegt sind.
2. System fordert den Unternehmer auf, Bankdaten einzugeben.
3. Unternehmer gibt Bankdaten ein und bestätigt die Eingabe.
4. System speichert die Bankdaten
5. gehe zu Schritt 2

TODO #4:
Alternativer Ereignisfluss Nr.2:
1. System zeigt eine Fehlermeldung, dass die verwendeten Bankdaten ungültig sind.
2. System fordert den Unternehmer auf, die Bankdaten zu korrigieren.
3. Unternehmer gibt Bankdaten erneut ein und bestätigt die Eingabe.
4. System speichert die Bankdaten und reicht den Auftrag an "Banking-Software" weiter.
5. gehe zu Schritt 8

TODO #5:
Nachbedingung:
- Es existiert eine Projektauschreibung vom Unternehmer im System.
- Mind. eine Bankverbindung des Unternehmers ist im System hinterlegt.
