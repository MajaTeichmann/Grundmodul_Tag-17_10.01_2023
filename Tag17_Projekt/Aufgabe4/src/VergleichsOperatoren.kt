//Todo: In dieser Aufgabe behandeln wir den Größer-Als-Vergleichsoperator (>) und den Kleiner-Als-Vergleichsoperator (<).
// a) Aufgabe:
// Schreibe eine If-Else-Verzweigung in der Funktion compareNumbers(), die zwei Zahlen number1 und number2 miteinander
// vergleicht.
// Verwende den Größer-Als-Operator.
// Wenn die erste Zahl größer als die zweite Zahl ist, soll "Die erste Zahl ist größer." über die println()-Funktion
// ausgegeben werden.
// Test:
// Der Code zum Testen in der main-Funktion ist bereits geschrieben. Du musst hier nichts verändern. Lass das Programm
// laufen, wenn in der Konsole das Folgende ausgegeben wird, hast du die If-Else-Verzweigung richtig erstellt.
// Die erste Zahl ist größer.

// todo: b) Aufgabe:
//  Erweiter oder veränder deinen Code:
//  Wenn die erste Zahl kleiner als die zweite Zahl ist, soll "Die erste Zahl ist kleiner." über die println()-Funktion
//  ausgegeben werden.
//  Test:
//  Der Code zum Testen in der main-Funktion ist bereits geschrieben. Du musst hier nichts verändern. Lass das Programm
//  laufen, wenn in der Konsole das Folgende ausgegeben wird, hast du die If-Else-Verzweigung richtig erstellt.
//  Die erste Zahl ist größer.
//  Die erste Zahl ist kleiner.

//  Achtung:
//  Wenn du zwei mal die Ausgabe "Die erste Zahl ist kleiner." in der Konsole hast, stimmt deine If-Verzweigung nicht.
//  Schau dir deine If-Else-Verzweigung und die Parameter in der main()-Funktion genau an. Wann genau wird "Die erste
//  Zahl ist kleiner." ausgegeben?

fun main() {
    compareNumbers(5, 2)
    compareNumbers(5, 7)
    compareNumbers(5, 5)
}

fun compareNumbers(number1: Int, number2: Int) {
    // Schreibe hier deinen Code.
    if (number1 > number2){
        println("Die erste Zahl ist größer.")
    }
    else if (number1 < number2){
        println("Die erste Zahl ist kleiner.")
    }
}