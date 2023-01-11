// In der Vorlesung hast du drei Verknüpfungsoperatoren kennen gelernt. Einmal den Nicht-Operator (!), den
// Und-Operator (&&) und den Oder-Operator (||).
// Mit den Verknüpfungsoperatoren können wir Ausdrücke verbinden.
// Ein Beispiel, die Auto-Software von gestern:
// "Wenn der Motor aus ist und alle Türen geschlossen sind, starte die Software."
// val isMotorRunning: Boolean = true
// val doorsAreClosed: Boolean = true
// if (isMotorRunning && doorsAreClosed) {
// startSoftware()
// }

// Weil sowohl isMotorRunning als auch doorsAreClosed true sind, ist auch die Und-Verknüpfung true Das kann sehr
// schnell verwirrend werden, schaut euch dazu die Seite im Handbuch an.

// todo: a) Wir schreiben eine Software für einen Zug. Der Zug soll nur fahren können, wenn alle Türen zu sind und der
//  Zug Strom hat.
//  Aufgabe:
//  Die Funktion trainSoftware() erhält die zwei Parameter vom Typ Boolean und gibt eine Statusmeldung zurück.
//  Einmal doorsAreClosed, das angibt, dass alle Türen im Zug geschlossen sind und einmal powerAvailable, das angibt,
//  dass der Zug Strom hat.
//  Wenn alle Türen geschlossen sind und der Zug Strom hat, soll die Funktion die Statusmeldung "Zug darf losfahren."
//  zurückgeben.
//  Ansonsten soll der Zug die Statusmeldung "Zug muss stehen bleiben." zurückgeben.
//  Schreibe eine If-Else-Verzweigung, verwende mindestens einen der Verknüpfungsoperatoren.
//  Test:
//  Der Code zum Testen in der main-Funktion ist bereits geschrieben. Du musst hier nichts verändern. Lass das Programm
//  laufen, wenn in der Konsole Perfekt! ausgegeben wird, hast du die If-Else-Verzweigung richtig erstellt.

fun main() {
    if (
        trainSoftware(true, true).lowercase() == "Zug darf losfahren.".lowercase() &&
        trainSoftware(false, true).lowercase() == "Zug muss stehen bleiben.".lowercase() &&
        trainSoftware(true, false).lowercase() == "Zug muss stehen bleiben.".lowercase() &&
        trainSoftware(false, false).lowercase() == "Zug muss stehen bleiben.".lowercase()
    ) {
        println("Perfekt!")
    } else {
        println("Fehler.")
    }
}

fun trainSoftware(doorsAreClosed: Boolean, powerAvailable: Boolean): String {
    return if(doorsAreClosed && powerAvailable){
        "Zug darf losfahren."
    }
    else{
        "Zug muss stehen bleiben."
    }
}