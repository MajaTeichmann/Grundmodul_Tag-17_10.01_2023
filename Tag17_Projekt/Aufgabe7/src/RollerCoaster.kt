//Todo: Du willst mit der Achterbahn fahren.
// Du darfst aber nur mitfahren, wenn du mindestens 170 cm groß bist, oder mindestens 18 Jahre alt bist.
// Und es darf nicht regnen.
// Darfst du mit der Achterbahn fahren?
// Aufgabe:
// die Funktion canIRide erhält die drei Parameter:
// (1) size vom Typ Int, dass deine Größe in cm angibt.
// (2) age vom Typ Int, dass dein Alter in Jahren angibt.
// (3) isRaining vom Typ Boolean, dass angibt, ob es gerade regnet.
// Die Funktion gibt zurück, ob du mit der Achterbahn fahren darfst (true) oder nicht (false).
// Schreibe eine If-Else-Verzweigung, verwende mindestens einen der Verknüpfungsoperatoren.
// Test:
// Der Code zum Testen in der main-Funktion ist bereits geschrieben. Du musst hier nichts verändern.
// Lass das Programm laufen, wenn in der Konsole Perfekt! ausgegeben wird, hast du die If-Else-Verzweigung richtig
// erstellt.
// Teste auch, ob du mit der Achterbahn fahren darfst, indem du die Funktion canIRide mit deiner Größe, deinem Alter und
// ob es gerade regnet, aufrufst. Darfst du mitfahren?

fun main() {
    if (
        canIRide(180, 20, false) &&
        canIRide(150, 20, false) &&
        canIRide(180, 15, false) &&
        !canIRide(150, 15, false) &&
        !canIRide(150, 15, true) &&
        !canIRide(180, 20, true) &&
        canIRide(175,26,false)
    ) {
        println("Perfekt!")
    } else {
        println("Fehler.")
    }

    // Teste hier dich selbst.

}

fun canIRide(size: Int, age: Int, isRaining: Boolean): Boolean {
    // Schreib hier deinen Code hin.
    return if (size >= 170 && !isRaining || age >= 18 && !isRaining){
       true
    }
    else {
        return false
    }
}