package tp10

fun calculer(a: Int, b: Int, callback: (Int) -> Unit) {
    val resultat = a + b
    callback(resultat)
}

fun main() {
    calculer(5, 7) { res ->
        println("Résultat du calcul : $res")
    }
}