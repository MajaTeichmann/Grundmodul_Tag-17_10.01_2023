
<h1 align="center">Grundlagen der Programmierung</h1>
<h3 align="center">Listen</h3>



#### Beschreibung:

Willkommen zurück zu den Übungen an Tag 17. Heute vertieft ihr das Thema Verzweigungen kombiniert mit Vergleichsoperatoren!





#### Hinweise zur Bearbeitung:

- Achte auf einen sauberen Quellcode, insbesondere Einrückungen sind wichtig!
- Wichtige Materialien für heute:
  - [Handbuch: Variablen & Datentypen → Nachschlagen → Kochrezept: Compilerfehler lösen](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.bpw3da2qtpg9)
  - [Handbuch: Verzweigungen → Implementieren → If-Else-Verzweigung implementieren](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.rlmqv2gebsn2)
  - [Handbuch: Verzweigungen → Implementieren → When-Verzweigung implementieren](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.qc6ti3gecmoi)
  - [Handbuch: Verzweigungen → Implementieren → Logikoperatoren](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.vqqvzaa3kyui)
---

<details>
<summary><b>Aufgabe 1 - Intro </b></summary>

Schau dir das Intro an.  
Wenn du Schwierigkeiten beim Bearbeiten der Aufgaben hast, schaue im Intro oder im Handbuch nach, 
ansonsten kannst du jederzeit die Tutoren fragen. Die Tutoren werden dir gerne helfen.

**Modul für die Aufgabe:** Aufgabe1  
**Datei für die Aufgabe:** Intro.kt

</details>

---
  
<details>
<summary><b>Aufgabe 2 - Ist-Gleich-Operator </b></summary>

In dieser Aufgabe schauen wir uns den Ist-Gleich-Operator an.

a)

Aufgabe:
- Schreibe eine If-Else-Verzweigung in der Funktion "isIntegerEqual",
die zwei Zahlen number1 und number2 miteinander vergleicht.
- Verwende den <span style=color:gold>Ist-Gleich-Operator</span>
- Wenn die Zahlen gleich sind, soll "Zahlen sind gleich." über die println()-Funktion 
ausgegeben werden.
- Wenn die Zahlen nicht gleich sind, soll "Zahlen sind nicht gleich." über die println()-Funktion
  ausgegeben werden.

Test:
- Der Code zum Testen in der main-Funktion ist bereits geschrieben. Du musst hier 
nichts verändern. Lass das Programm laufen, wenn in der Konsole das Folgende ausgegeben wird,
hast du die If-Else-Verzweigung richtig erstellt.

```
Zahlen sind gleich.
Zahlen sind nicht gleich.
```

b)

Aufgabe:
- Schreibe eine If-Else-Verzweigung in der Funktion "isStringEqual",
  die zwei Strings string1 und string2 miteinander vergleicht.
- Verwende den <span style=color:gold>Ist-Gleich-Operator</span>
- Wenn die Strings gleich sind, soll "Strings sind gleich." über die println()-Funktion
  ausgegeben werden.
- Wenn die Strings nicht gleich sind, soll "Strings sind nicht gleich." über die println()-Funktion
  ausgegeben werden.

Test:
- Der Code zum Testen in der main-Funktion ist bereits geschrieben. Du musst hier
  nichts verändern. Lass das Programm laufen, wenn in der Konsole das Folgende ausgegeben wird,
  hast du die If-Else-Verzweigung richtig erstellt.

```
Strings sind nicht gleich.
Strings sind gleich.
```


**Modul für die Aufgabe:** Aufgabe2  
**Datei für die Aufgabe:** IstGleichOperator.kt  

</details>

---

<details>
<summary><b>Aufgabe 3 - Ist-Ungleich-Operator  </b></summary>

In dieser Aufgabe schauen wir uns den Ist-Ungleich-Operator (!=) an.
Er funktioniert ähnlich wie der Ist-Gleich-Operator, mit einem kleinen Unterschied.
Wenn die Werte ungleich sind, gibt der Ist-Ungleich-Operator `true` zurück,
ansonsten `false`.

a)

Aufgabe:
- Schreibe eine If-Else-Verzweigung in der Funktion "isDoubleUnequal",
  die zwei Zahlen number1 und number2 miteinander vergleicht.
- Verwende den <span style=color:gold>Ist-Ungleich-Operator</span>.
- Wenn die Zahlen nicht gleich sind, soll "Zahlen sind nicht gleich." über die println()-Funktion
  ausgegeben werden.
- Wenn die Zahlen gleich sind, soll "Zahlen sind gleich." über die println()-Funktion
ausgegeben werden.

Test:
- Der Code zum Testen in der main-Funktion ist bereits geschrieben. Du musst hier
  nichts verändern. Lass das Programm laufen, wenn in der Konsole das Folgende ausgegeben wird,
  hast du die If-Else-Verzweigung richtig erstellt.

```
Zahlen sind nicht gleich.
Zahlen sind gleich.
```

b)

Aufgabe:
- Schreibe eine If-Else-Verzweigung in der Funktion "isBooleanUnequal",
  die zwei Boolean boolean1 und boolean2 miteinander vergleicht.
- Verwende den <span style=color:gold>Ist-Ungleich-Operator</span>.
- Wenn die Boolean nicht gleich sind, soll "Boolean sind nicht gleich." über die println()-Funktion
  ausgegeben werden.
- Wenn die Boolean gleich sind, soll "Boolean sind gleich." über die println()-Funktion
  ausgegeben werden.

Test:
- Der Code zum Testen in der main-Funktion ist bereits geschrieben. Du musst hier
  nichts verändern. Lass das Programm laufen, wenn in der Konsole das Folgende ausgegeben wird,
  hast du die If-Else-Verzweigung richtig erstellt.

```
Boolean sind nicht gleich.
Boolean sind gleich.
```









**Modul für die Aufgabe:** Aufgabe3  
**Datei für die Aufgabe:** IstUngleichOperator.kt

</details>

---

<details>
<summary><b>Aufgabe 4 - Weitere Vergleichsoperatoren </b></summary>

In dieser Aufgabe behandeln wir den Größer-Als-Vergleichsoperator (>) und den Kleiner-Als-Vergleichsoperator (<).

a)

Aufgabe:
- Schreibe eine If-Else-Verzweigung in der Funktion compareNumbers(),
  die zwei Zahlen number1 und number2 miteinander vergleicht.
- Verwende den <span style=color:gold>Größer-Als-Operator</span>.
- Wenn die erste Zahl größer als die zweite Zahl ist, soll "Die erste Zahl ist größer." über die println()-Funktion
  ausgegeben werden.

Test:
- Der Code zum Testen in der main-Funktion ist bereits geschrieben. Du musst hier
  nichts verändern. Lass das Programm laufen, wenn in der Konsole das Folgende ausgegeben wird,
  hast du die If-Else-Verzweigung richtig erstellt.

```
Die erste Zahl ist größer.
```

b)

Aufgabe:
- Erweiter oder veränder deinen Code:
- Wenn die erste Zahl kleiner als die zweite Zahl ist, soll "Die erste Zahl ist kleiner." über die println()-Funktion
  ausgegeben werden.

Test:
- Der Code zum Testen in der main-Funktion ist bereits geschrieben. Du musst hier
  nichts verändern. Lass das Programm laufen, wenn in der Konsole das Folgende ausgegeben wird,
  hast du die If-Else-Verzweigung richtig erstellt.

```
Die erste Zahl ist größer.
Die erste Zahl ist kleiner.
```

Achtung:
- Wenn du zwei mal die Ausgabe "Die erste Zahl ist kleiner." in der Konsole hast, stimmt deine If-Verzweigung nicht.
- Schau dir deine If-Else-Verzweigung und die Parameter in der main()-Funktion genau an.
Wann genau wird "Die erste Zahl ist kleiner." ausgegeben?


**Modul für die Aufgabe:** Aufgabe4  
**Datei für die Aufgabe:** VergleichsOperatoren.kt
</details>

---

<details>
<summary><b>Aufgabe 5 - Kleiner-Gleich-Operator  </b></summary>

Hier üben wir die Vergleichsoperatoren Kleiner-Gleich (<=) und Größer-Gleich (>=).
Sie werden sehr ähnlich wie die Kleiner- und Größer-Vergleichsoperatoren aus der vorherigen Aufgabe verwendet.

a)

Aufgabe:
- Schreibe eine Funktion, die als Parameter zwei Zahlen vom Typ Integer erhält. 
- Wenn die erste Zahl <span style=color:gold>höchstens</span> so groß ist wie die zweite Zahl, soll die Funktion `true` zurück geben,
ansonsten `false`.

Test:
- Teste deine Funktion, indem du sie in der main()-Funktion mit den folgenden Parametern aufrufst und den 
Rückgabewert der Funktion mit der println()-Funktion in der Konsole ausgibst.
```
Parameter:          Konsole:
2, 5                true
5, 5                true
6, 5                false
```
D.h. wenn ich die Funktion mit den Parametern `2` und `5` aufrufe, soll in der Konsole `true` ausgegeben werden.

b)

Aufgabe:
- Schreibe eine Funktion, die als Parameter zwei Zahlen vom Typ Integer erhält.
- Wenn die erste Zahl <span style=color:gold>mindestens</span> so groß ist wie die zweite Zahl, soll die Funktion `true` zurück geben,
  ansonsten `false`.

Test:
- Teste deine Funktion, indem du sie in der main()-Funktion mit den folgenden Parametern aufrufst und den
  Rückgabewert der Funktion mit der println()-Funktion in der Konsole ausgibst.
```
Parameter:          Konsole:
7, 5                true
5, 5                true
2, 5                false
```
D.h. wenn ich die Funktion mit den Parametern `7` und `5` aufrufe, soll in der Konsole `true` ausgegeben werden.


**Modul für die Aufgabe:** Aufgabe5  
**Datei für die Aufgabe:** KleinerGroeserGleich.kt

</details>

---

<details>
<summary><b>Aufgabe 6 - Verknüpfungsoperatoren </b></summary>

In der Vorlesung hast du drei Verknüpfungsoperatoren kennen gelernt.
Einmal den Nicht-Operator (!), den Und-Operator (&&) und den Oder-Operator (||).

Mit den Verknüpfungsoperatoren können wir Ausdrücke verbinden.

Ein Beispiel, die Auto-Software von gestern:

"Wenn der Motor aus ist <span style=color:gold>und</span> alle Türen geschlossen sind, starte die Software."

```
val isMotorRunning: Boolean = true
val doorsAreClosed: Boolean = true

if (isMotorRunning && doorsAreClosed) {
    startSoftware()
}
```

Weil sowohl isMotorRunning als auch doorsAreClosed `true` sind, ist auch die Und-Verknüpfung `true`
Das kann sehr schnell verwirrend werden, schaut euch dazu die Seite im Handbuch an.

a)

Wir schreiben eine Software für einen Zug. 
Der Zug soll nur fahren können, wenn alle Türen zu sind und der Zug Strom hat. 

Aufgabe: 
- Die Funktion trainSoftware() erhält die zwei Parameter vom Typ Boolean und gibt eine Statusmeldung zurück.  
Einmal doorsAreClosed, das angibt, dass alle Türen im Zug geschlossen sind  
und einmal powerAvailable, das angibt, dass der Zug Strom hat.
- Wenn alle Türen geschlossen sind und der Zug Strom hat, soll die Funktion die Statusmeldung "Zug darf losfahren." zurückgeben.
- Ansonsten soll der Zug die Statusmeldung "Zug muss stehen bleiben." zurückgeben.
- Schreibe eine If-Else-Verzweigung, verwende mindestens einen der Verknüpfungsoperatoren. 

Test:
- Der Code zum Testen in der main-Funktion ist bereits geschrieben. Du musst hier nichts verändern. 
Lass das Programm laufen, 
wenn in der Konsole `Perfekt!` ausgegeben wird, hast du die If-Else-Verzweigung richtig erstellt.



**Modul für die Aufgabe:** Aufgabe6  
**Datei für die Aufgabe:** LogikOperatoren.kt

</details>


---


<details>
<summary><b>Aufgabe 7 - Achterbahn </b></summary>

Du willst mit der Achterbahn fahren.  
Du darfst aber nur mitfahren, wenn du mindestens 170 cm groß bist, oder mindestens 18 Jahre alt bist.  
Und es darf nicht regnen.  
Darfst du mit der Achterbahn fahren?

Aufgabe:
- die Funktion canIRide erhält die drei Parameter:  
  (1) size vom Typ Int, dass deine Größe in cm angibt.  
  (2) age vom Typ Int, dass dein Alter in Jahren angibt.  
  (3) isRaining vom Typ Boolean, dass angibt, ob es gerade regnet.  
- Die Funktion gibt zurück, ob du mit der Achterbahn fahren darfst `true` oder nicht `false`.
- Schreibe eine If-Else-Verzweigung, verwende mindestens einen der Verknüpfungsoperatoren.

Test:
- Der Code zum Testen in der main-Funktion ist bereits geschrieben. Du musst hier nichts verändern.
  Lass das Programm laufen,
  wenn in der Konsole `Perfekt!` ausgegeben wird, hast du die If-Else-Verzweigung richtig erstellt.
- Teste auch, ob du mit der Achterbahn fahren darfst, indem du die Funktion canIRide mit deiner Größe, 
deinem Alter und ob es gerade regnet, aufrufst. Darfst du mitfahren?

**Modul für die Aufgabe:** Aufgabe7  
**Datei für die Aufgabe:** RollerCoaster.kt

</details>
 

---


<details>
<summary> <b>Aufgabe 8 - Praemie </b> </summary>

Alle Bestandskunden eines Mobilfunkanbieters sollen eine Prämie erhalten.
Die Vertragsdauer eines Bestandskunden wird in der Konstante duration in Monaten angegeben.

Die Belohnungen sehen wie folgt aus:
- Weniger als 1 Jahr: Keine Prämie
- Mehr als 1 Jahr: 5€ Amazon-Gutschein
- Mehr als 2 Jahre: 15€ Amazon Gutschein
- Mehr als 3 Jahre: 25€ Amazon Gutschein
- 4 oder noch mehr Jahre: 50€ Amazon Gutschein

Schreibe ein Programm, das anhand der Vertragsdauer in der Konstante duration
die Prämie in der Konsole ausgibt.

Ein Beispiel:

(Vertragsdauer von 18 Monaten, also 1.5 Jahren)
duration = 18 -> In der Konsole wird "5€ Amazon-Gutschein" ausgegeben.

Teste dein Programm, indem du den Wert der Konstante änderst und dann das Programm laufen lässt.
Teste dein Programm mit diesen Werten und prüfe, ob das Richtige in der Konsole ausgegeben wird:

```
    val duration: Int = 4     -> "Keine Prämie"
    val duration: Int = 18    -> "5€ Amazon-Gutschein"
    val duration: Int = 26    -> "15€ Amazon-Gutschein"
    val duration: Int = 120   -> "50€ Amazon-Gutschein"
```


**Modul für die Aufgabe:** *Aufgabe8*
**Datei für die Aufgabe:** *Praemie.kt*


</details>


