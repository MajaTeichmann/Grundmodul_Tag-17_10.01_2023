//TODO: Alle Bestandskunden eines Mobilfunkanbieters sollen eine Prämie erhalten. Die Vertragsdauer eines Bestandskunden
// wird in der Konstante duration in Monaten angegeben.
// Die Belohnungen sehen wie folgt aus:
// Weniger als 1 Jahr: Keine Prämie (0-11 Monate)
// Mehr als 1 Jahr: 5€ Amazon-Gutschein (12-23 Monate)
// Mehr als 2 Jahre: 15€ Amazon Gutschein (24-35 Monate)
// Mehr als 3 Jahre: 25€ Amazon Gutschein (36-47 Monate)
// 4 oder noch mehr Jahre: 50€ Amazon Gutschein (>=48 Monate)
// Schreibe ein Programm, das anhand der Vertragsdauer in der Konstante duration die Prämie in der Konsole ausgibt.
// Ein Beispiel:
// (Vertragsdauer von 18 Monaten, also 1.5 Jahren) duration = 18 -> In der Konsole wird "5€ Amazon-Gutschein" ausgegeben.
// Teste dein Programm, indem du den Wert der Konstante änderst und dann das Programm laufen lässt. Teste dein Programm
// mit diesen Werten und prüfe, ob das Richtige in der Konsole ausgegeben wird:
// val duration: Int = 4     -> "Keine Prämie"
// val duration: Int = 18    -> "5€ Amazon-Gutschein"
// val duration: Int = 26    -> "15€ Amazon-Gutschein"
// val duration: Int = 120   -> "50€ Amazon-Gutschein"

fun main() {
    println("Wie viele Monate du schon bei Mobilfunkanbieter XYZ?")
    val duration: Int = readln().toInt()

    if (duration<=11){
        println("Keine Prämie")
    }
        else if (duration<=23){
            println("5€ Amazon-Gutschein")
        }
            else if (duration<=35){
                println("15€ Amazon Gutschein")
            }
                else if (duration<=47){
                    println("25€ Amazon Gutschein")
                }
                    else if (duration>=48){
                        println("50€ Amazon Gutschein")
                    }
                        else if (duration<0){
                            println("Fehler!")
                        }
}