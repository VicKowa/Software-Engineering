Aufgabe2:
a)
Ja, die Anforderung sollte auf mehrere User Stories aufgeteilt werden:

U1: Als Studierender möchte ich nach Projektauschreibung suchen können.
U2: Als Studierender möchte ich mich auf eine Projektauschreibung bewerben können.

Akzeptanztest für U1:
Vorbedingungen:
- Benutzer ist auf Startseite angemeldet
- Es sind Projektauschreibungen verfügbar

Schritte:
1. Benutzer wählt option "Projektauschreibungen durchsuchen" -> Suchfenster öffent sich
2. Benutzer wählt den Filter "Unternehmen" aus und gibt Namen eines Unternehmen ein und klickt auf "Suchen" -> Liste mit Projektauschreibungen vom Unternehmen werden aufgelistet 


Akzeptanztest für U2:
Vorbedingungen:
- Benutzer hat eine Projektauschreibung ausgewählt
- Es sind Projektauschreibungen verfügbar

Schritte:
1. Benutzer wählt "Bewerben" -> Bewerbungsformular öffnet sich
2. Benutzer füllt formular mit gültigen Werten aus -> Werte werden akzeptiert
3. Benutzer lädt seine Bewerbungsmappe als PDF hoch -> PDF wird hinzugefügt
4. Benutzer wählt "Abschicken" -> es erscheint Meldung, dass Bewerbung erfolgreich abgeschickt wurde

----------------------------------------------------------------------------------------------------------------
c) textueller Use Case:
Name des Use Case: Auf Projektauschreibung bewerben
Teilnehmende Akteure: Student
Ereignisfluss:
1. Benutzer wählt die Option "Bewerben"
2. Benutzer füllt formular mit gültigen Werten aus 
	2.1 Falls die Daten korrekt sind, bereitet das
	    SYSTEM Erstellung der Bewerbung vor
	2.2 Falls die Daten nicht korrekt sind, fordert
	    das SYSTEM erneute Eingabe der Daten
3. Benutzer lädt seine Bewerbungsmappe als PDF hoch 
	3.1 Falls hochgeladene Datei eine PDF ist, dann
	    fügt SYSTEM Datei zur Bewerbung hinzu
	3.2 Falls hochgeladene Datei keine PDF, dann
	    fordert SYSTEM den erneuten Upload einer PDF Datei
4. Benutzer wählt "Abschicken"

Vorbedingungen:
- Anwender ist als Student registriert und eingeloggt
- Benutzer hat eine Projektauschreibung ausgewählt
- Es sind Projektauschreibungen verfügbar

Nachbedingungen:
- Die Bewerbung wird gespeichert und für das Unternehmen sichtbar






