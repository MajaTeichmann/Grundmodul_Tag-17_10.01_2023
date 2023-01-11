// In dieser Aufgabe schauen wir uns den Ist-Gleich-Operator an.

// TODO: a) Aufgabe:
//  Schreibe eine If-Else-Verzweigung in der Funktion "isIntegerEqual", die zwei Zahlen number1 und number2 miteinander
//  vergleicht.
//  Verwende den Ist-Gleich-Operator
//  Wenn die Zahlen gleich sind, soll "Zahlen sind gleich." über die println()-Funktion ausgegeben werden.
//  Wenn die Zahlen nicht gleich sind, soll "Zahlen sind nicht gleich." über die println()-Funktion ausgegeben werden.
//  Test:
//  Der Code zum Testen in der main-Funktion ist bereits geschrieben. Du musst hier nichts verändern. Lass das Programm
//  laufen, wenn in der Konsole das Folgende ausgegeben wird, hast du die If-Else-Verzweigung richtig erstellt.
//  Zahlen sind gleich.
//  Zahlen sind nicht gleich.

fun main() {
    isIntegerEqual(5, 5)
    isIntegerEqual(5, 10)
    isStringEqual("Hallo", "Welt")
    isStringEqual("Welt", "Welt")
}

fun isIntegerEqual(number1: Int, number2: Int) {
    // Schreibe hier deinen Code.
    var istGleichA = number1 == number2

    if (istGleichA){
        println("Zahlen sind gleich")
    }
        else {
            println("Zahlen sind nicht gleich")
        }
}

//Todo: b) Aufgabe:
// Schreibe eine If-Else-Verzweigung in der Funktion "isStringEqual", die zwei Strings string1 und string2 miteinander
// vergleicht.
// Verwende den Ist-Gleich-Operator
// Wenn die Strings gleich sind, soll "Strings sind gleich." über die println()-Funktion ausgegeben werden.
// Wenn die Strings nicht gleich sind, soll "Strings sind nicht gleich." über die println()-Funktion ausgegeben werden.
// Test:
// Der Code zum Testen in der main-Funktion ist bereits geschrieben. Du musst hier nichts verändern. Lass das Programm
// laufen, wenn in der Konsole das Folgende ausgegeben wird, hast du die If-Else-Verzweigung richtig erstellt.
// Strings sind nicht gleich.
// Strings sind gleich.

fun isStringEqual(string1: String, string2: String) {
    // Schreibe hier deinen Code.
    var istGleichB = string1 == string2

    if (istGleichB){
        println("Strings sind gleich.")
    }
        else {
            println("Strings sind nicht gleich.")
    }
}