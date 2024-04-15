# Uebung 1
Frage 1: Wie können Sie unter Berücksichtigung der Prinzipien des
objektorientierten Entwurfs dafür sorgen, dass der Code, der den beiden
Implementierungen gemeinsam ist, nicht dupliziert wird?

=> Mithilfe der Vererbung: Durch die Erstellung einer abstrakten Klasse, 
welche das Interface NumberTransformer implementiert.
In der abstrakten Klasse werden die funktionen implementiert, welche jeweils in RomanNumberTransf. und 
GermanFormatNumberTransf. beide vorkommen, sodass sie diese dann erben können.
abstrakt -> Weil kein GeneralTransformer instanziierbar sein soll 


Frage 4: Warum sollten Testfälle in einer separaten Test-Klasse implementiert
werden?

Der Programmcode ist so organisierter und lesbarer man kann leicht zwischen dem Code und Testcode unterscheiden.
Dies ermöglicht ebenfalls eine leichtere Wartung des Codes, weil man so weiß, welcher Teil von welchen abhängig ist und
Probleme können leichter identifiziert werden.


Frage 5: Wozu dienen die Äquivalenzklassen im Blackbox-Test?

Sie dienen zum Partitionieren von gleichen erwarteten Ergebnissen.
Eine Äquivalenzklasse beinhaltet also alle Eingabewerte, die sich bei der Eingabe in das Testobjekt gleich verhalten.
Somit lassen sich die Eingaben eingrenzen und entsprechend gruppieren. Zudem werden alle möglichen Eingaben effizient 
abgedeckt in einer minimalen Anzahl an Tests.






