# Uebung 1
Frage 1: Wie können Sie unter Berücksichtigung der Prinzipien des
objektorientierten Entwurfs dafür sorgen, dass der Code, der den beiden
Implementierungen gemeinsam ist, nicht dupliziert wird?

A: Mithilfe der Vererbung: Durch die Erstellung einer abstrakten Klasse, 
welche das Interface NumberTransformer implementiert.
In der abstrakten Klasse werden die funktionen implementiert, welche jeweils in RomanNumberTransf. und 
GermanFormatNumberTransf. beide vorkommen, sodass sie diese dann erben können.
abstrakt -> Weil kein GeneralTransformer instanziierbar sein soll 


Frage 2: Wie kann die Objekterzeugung mit Hilfe einer zusätzlichen Klasse durchgeführt werden? 
In welchem Package sollte diese zusätzliche Klasse liegen?

A: Man kann eine neue Klasse erstellen, welche jeweils eine „static“ Methode hat,
um das jeweilige Objekt einer anderen Klasse zu erzeugen. Eine andere Aufgabe hat diese Zusatzklasse nicht.
Die zusätzliche Klasse sollte in demselben Package liegen, wie die Klassen dessen Objekte erzeugt werden sollen.


Frage 3: Welches Entwurfsmuster liegt für diesen Anwendungsfall nahe?
Welchen Vorteil bringt die Nutzung dieses Entwurfsmusters?

A: Das Entwurfsmuster ist das Factory Design Pattern. Der Vorteil besteht darin, dass die Objekterzeugung gekapselt wird.
Das bedeutet man kann theoretisch die Klasse hinter der Fabrikklasse, also die Klasse,
für die ein Objekt erzeugt werden soll, einfach austauschen, ohne dass man viel im Code selbst umändern muss.
Der Code wird dadurch flexibler und einfacher zu warten.


Frage 4: Warum sollten Testfälle in einer separaten Test-Klasse implementiert
werden?

A: Der Programmcode ist so organisierter und lesbarer man kann leicht zwischen dem Code und Testcode unterscheiden.
Dies ermöglicht ebenfalls eine leichtere Wartung des Codes, weil man so weiß, welcher Teil von welchen abhängig ist und
Probleme können leichter identifiziert werden.


Frage 5: Wozu dienen die Äquivalenzklassen im Blackbox-Test?

A: Sie dienen zum Partitionieren von gleichen erwarteten Ergebnissen.
Eine Äquivalenzklasse beinhaltet also alle Eingabewerte, die sich bei der Eingabe in das Testobjekt gleich verhalten.
Somit lassen sich die Eingaben eingrenzen und entsprechend gruppieren. Zudem werden alle möglichen Eingaben effizient 
abgedeckt in einer minimalen Anzahl an Tests.


Frage 6: Warum lässt sich für die Klasse Client nicht ohne weiteres ein Blackbox-Test umsetzen?

A: Da die Klasse Client nur eine Methode hat, welche keinen Rückgabewert hat.
Das bedeutet, es kommt nichts zurück, dass man prüfen könnte. Die Prüfung der Ausgabe in der Konsole wäre umständlich. 





