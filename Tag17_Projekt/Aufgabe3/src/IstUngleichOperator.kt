//TODO: In dieser Aufgabe schauen wir uns den Ist-Ungleich-Operator (!=) an. Er funktioniert ähnlich wie der
// Ist-Gleich-Operator, mit einem kleinen Unterschied. Wenn die Werte ungleich sind, gibt der Ist-Ungleich-Operator
// true zurück, ansonsten false.
// a) Aufgabe:
// Schreibe eine If-Else-Verzweigung in der Funktion "isDoubleUnequal", die zwei Zahlen number1 und number2 miteinander
// vergleicht.
// Verwende den Ist-Ungleich-Operator.
// Wenn die Zahlen nicht gleich sind, soll "Zahlen sind nicht gleich." über die println()-Funktion ausgegeben werden.
// Wenn die Zahlen gleich sind, soll "Zahlen sind gleich." über die println()-Funktion ausgegeben werden.
// Test:
// Der Code zum Testen in der main-Funktion ist bereits geschrieben. Du musst hier nichts verändern. Lass das Programm
// laufen, wenn in der Konsole das Folgende ausgegeben wird, hast du die If-Else-Verzweigung richtig erstellt.
// Zahlen sind nicht gleich.
// Zahlen sind gleich.

fun main() {
    isDoubleUnequal(5.0, 10.0)
    isDoubleUnequal(10.0, 10.0)
    isBooleanUnequal(false, true)
    isBooleanUnequal(true, true)
}

fun isDoubleUnequal(number1: Double, number2: Double) {
    // Schreibe hier deinen Code.
    var a = number1 != number2

    if (a){
        println("Zahlen sind nicht gleich.")
    }
    else {
        println("Zahlen sind gleich.")
    }
}

//Todo: b) Aufgabe:
// Schreibe eine If-Else-Verzweigung in der Funktion "isBooleanUnequal", die zwei Boolean boolean1 und boolean2
// miteinander vergleicht.
// Verwende den Ist-Ungleich-Operator.
// Wenn die Boolean nicht gleich sind, soll "Boolean sind nicht gleich." über die println()-Funktion ausgegeben werden.
// Wenn die Boolean gleich sind, soll "Boolean sind gleich." über die println()-Funktion ausgegeben werden.
// Test:
// Der Code zum Testen in der main-Funktion ist bereits geschrieben. Du musst hier nichts verändern. Lass das Programm
// laufen, wenn in der Konsole das Folgende ausgegeben wird, hast du die If-Else-Verzweigung richtig erstellt.
// Boolean sind nicht gleich.
// Boolean sind gleich.

fun isBooleanUnequal(boolean1: Boolean, boolean2: Boolean) {
    // Schreibe hier deinen Code.
    var b = boolean1 != boolean2

    if (b){
        println("Boolean sind nicht gleich.")
    }
    else{
        println("Boolean sind gleich.")
    }
}