import kotlin.math.PI

// Classe parent Forme
abstract class Forme(val nom: String) {
    abstract fun surface(): Double
    abstract fun perimetre(): Double

    fun afficher_details() {
        println("Forme: $nom")
        println("Surface: ${surface()}")
        println("Périmètre: ${perimetre()}")
        println("---")
    }
}

// Classe Carré qui hérite de Forme
class Carre(private val cote: Double) : Forme("Carré") {
    override fun surface(): Double = cote * cote
    override fun perimetre(): Double = 4 * cote
}

// Classe Rectangle qui hérite de Forme
class Rectangle(private val longueur: Double, private val largeur: Double) : Forme("Rectangle") {
    override fun surface(): Double = longueur * largeur
    override fun perimetre(): Double = 2 * (longueur + largeur)
}

// Classe Cercle qui hérite de Forme
class Cercle(private val rayon: Double) : Forme("Cercle") {
    override fun surface(): Double = PI * rayon * rayon
    override fun perimetre(): Double = 2 * PI * rayon
}

// Programme principal
fun main() {
    // Création d'objets
    val carre = Carre(5.0)
    val rectangle = Rectangle(4.0, 6.0)
    val cercle = Cercle(3.0)

    // Affichage des détails
    carre.afficher_details()
    rectangle.afficher_details()
    cercle.afficher_details()
}