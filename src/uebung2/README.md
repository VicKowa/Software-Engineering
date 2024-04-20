Aufgabe 2:
Falls es zu der übergebenen ID kein vorhandenes Objekt in der CardBox gibt, soll über
einen von Ihnen frei wählbaren Rückgabewert eine Fehlermeldung ausgegeben werden.
Welche Nachteile ergeben sich aus Ihrer Sicht bei einer solchen Fehlerbehandlung
gegenüber Exceptions? (Kurze Erläuterung)

Antwort:

Bei einer Fehlerbehandlung durch Rückgabewerte wird der Fehler nicht direkt behandelt,
sondern nur ein Wert zurückgegeben, der auf einen Fehler hinweist.
Der Aufrufer muss dann diesen Wert prüfen und entsprechend reagieren.
Das kann dazu führen, dass der Fehler nicht direkt behandelt wird
und das Programm in einem undefinierten Zustand weiterläuft. 
Bei Exceptions wird der Fehler direkt behandelt und das Programm kann
in einem definierten Zustand weiterlaufen. Exceptions sind also sicherer
als Fehlerbehandlung durch Rückgabewerte.
