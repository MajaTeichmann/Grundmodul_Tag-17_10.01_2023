//TODO: Hier üben wir die Vergleichsoperatoren Kleiner-Gleich (<=) und Größer-Gleich (>=). Sie werden sehr ähnlich wie
// die Kleiner- und Größer-Vergleichsoperatoren aus der vorherigen Aufgabe verwendet.
// a) Aufgabe:
// Schreibe eine Funktion, die als Parameter zwei Zahlen vom Typ Integer erhält.
// Wenn die erste Zahl höchstens so groß ist wie die zweite Zahl, soll die Funktion true zurück geben, ansonsten false.
// Test:
// Teste deine Funktion, indem du sie in der main()-Funktion mit den folgenden Parametern aufrufst und den Rückgabewert
// der Funktion mit der println()-Funktion in der Konsole ausgibst.
// Parameter:          Konsole:
// 2, 5                true
// 5, 5                true
// 6, 5                false
// D.h. wenn ich die Funktion mit den Parametern 2 und 5 aufrufe, soll in der Konsole true ausgegeben werden.

fun main() {
    println("Aufgabe A")
    aufgabeA(2,5)
    aufgabeA(5,5)
    aufgabeA(6,5)
    println("")
    println("Aufgabe B")
    aufgabeB(7,5)
    aufgabeB(5,5)
    aufgabeB(2,5)
}

fun aufgabeA(number1: Int, number2: Int){
    if (number1<=number2){
        println(true)
    }
    else {
        println(false)
    }
}

//Todo: b) Aufgabe:
// Schreibe eine Funktion, die als Parameter zwei Zahlen vom Typ Integer erhält.
// Wenn die erste Zahl mindestens so groß ist wie die zweite Zahl, soll die Funktion true zurück geben, ansonsten false.
// Test:
// Teste deine Funktion, indem du sie in der main()-Funktion mit den folgenden Parametern aufrufst und den Rückgabewert
// der Funktion mit der println()-Funktion in der Konsole ausgibst.
// Parameter:          Konsole:
// 7, 5                true
// 5, 5                true
// 2, 5                false
// D.h. wenn ich die Funktion mit den Parametern 7 und 5 aufrufe, soll in der Konsole true ausgegeben werden.

fun aufgabeB(number3: Int, number4: Int){
    if (number3 >= number4){
        println(true)
    }
    else{
        println(false)
    }
}