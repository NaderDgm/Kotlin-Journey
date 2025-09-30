package tp11

fun divide(dividende: Int, diviseur: Int): Int? {
    return try {
        dividende / diviseur
    } catch (e: ArithmeticException) {
        println("Erreur : division par zéro interdite.")
        null
    }
}