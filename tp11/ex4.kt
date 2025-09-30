package TP11

fun main() {
    // 1. Fonction anonyme pour vérifier si un nombre est pair
    val estPair = { n: Int -> n % 2 == 0 }

    // 2. Liste de nombres à tester
    val nombres = listOf(3, 8, 15, 22, 41, 60)

    // 3. Test et affichage du résultat
    for (nombre in nombres) {
        if (estPair(nombre)) {
            println("$nombre est pair")
        } else {
            println("$nombre est impair")
        }
    }
}