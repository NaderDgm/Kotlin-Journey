package test


open class NegativeNumberException(message: String) : Exception(message){

}
fun convertToInt(input: String): Int? {
    return try {
        val number = input.toInt()
        if (number < 0) {
            throw NegativeNumberException("Erreur : nombre négatif détecté.")
        }
        number
    } catch (e: NumberFormatException) {
        println("Erreur : format invalide, impossible de convertir '$input' en entier.")
        null
    } catch (e: NegativeNumberException) {
        println(e.message)
        null
    }
}
fun main() {
    println("Résultat 1 : ${convertToInt("42")}")       // OK
    println("Résultat 2 : ${convertToInt("-5")}")       // Exception personnalisée
    println("Résultat 3 : ${convertToInt("abc")}")      // Format invalide
           // Division par zéro
}