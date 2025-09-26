package tp9

fun main() {
    val notes = mutableListOf<Double>()
    for (i in 1..3) {
        print("Entrez la note $i : ")
        val note = readLine()?.toDoubleOrNull() ?: return
        notes.add(note)
    }

    val moyenne = notes.average()
    println("Moyenne : $moyenne")

    when {
        moyenne >= 80 -> println("Réussi avec mention excellente")
        moyenne >= 50 -> println("Réussi")
        else -> println("Échoué")
    }
}