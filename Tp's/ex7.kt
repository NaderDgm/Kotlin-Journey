package `Tp's`

class Personne(
    var nom: String,
    var prenom: String,
    var adresse: String,
    var age: Int
) {

    fun updateNom(nouveauNom: String) {
        nom = nouveauNom
    }

    fun updatePrenom(nouveauPrenom: String) {
        prenom = nouveauPrenom
    }

    fun updateAge(nouvelAge: Int) {
        age = nouvelAge
    }

    fun updateAdresse(nouvelleAdresse: String) {
        adresse = nouvelleAdresse
    }


    fun affiche() {
        println("Nom : $nom")
        println("Prénom : $prenom")
        println("Adresse : $adresse")
        println("Âge : $age ans")
    }
}

fun main() {
    val personne = Personne("Dupont", "Jean", "Paris", 25)

    println("=== Avant modification ===")
    personne.affiche()

    personne.updateNom("Durand")
    personne.updatePrenom("Paul")
    personne.updateAge(30)
    personne.updateAdresse("Lyon")

    println(" Après modification")
    personne.affiche()
}