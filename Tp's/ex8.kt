package `Tp's`

class Car(
    var marque: String,
    var modele: String,
    var couleur: String,
    var kilometrage: Int
) {
    fun updateMarque(nouvelleMarque: String) {
        marque = nouvelleMarque
    }

    fun updateModele(nouveauModele: String) {
        modele = nouveauModele
    }

    fun updateCouleur(nouvelleCouleur: String) {
        couleur = nouvelleCouleur
    }

    fun updateKilometrage(nouveauKilometrage: Int) {
        kilometrage = nouveauKilometrage
    }

    fun affiche() {
        println("Marque : $marque")
        println("Modèle : $modele")
        println("Couleur : $couleur")
        println("Kilométrage : $kilometrage km")
    }
}

fun main() {
    val voiture = Car("Toyota", "Corolla", "Rouge", 50000)

    println("=== Avant modification ===")
    voiture.affiche()

    voiture.updateMarque("Honda")
    voiture.updateModele("Civic")
    voiture.updateCouleur("Bleu")
    voiture.updateKilometrage(60000)

    println("\n=== Après modification ===")
    voiture.affiche()
}