package TP11

fun main() {
    // Création de la liste de nombres
    val nombres = listOf(10, 20, 30, 40, 50, 60)

    // Fonction anonyme pour calculer la somme
    val somme = { liste: List<Int> -> liste.sum() }

    // Appel de la fonction et affichage du résultat
    println("La somme des éléments est : ${somme(nombres)}")
}
