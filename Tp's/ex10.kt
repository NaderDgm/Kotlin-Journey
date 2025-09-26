package `Tp's`

open class Vehicule(
    val marque: String,
    val modele: String
) {
    open fun afficherDetails() {
        println("Marque : $marque, Modèle : $modele")
    }

    open fun seDeplacer() {
        println("Le véhicule se déplace...")
    }
}

class Avion(
    marque: String,
    modele: String,
    val ailes: Int,
    val nbrRoues: Int
) : Vehicule(marque, modele) {

    override fun afficherDetails() {
        println("✈️ Avion -> Marque : $marque, Modèle : $modele, Ailes : $ailes, Roues : $nbrRoues")
    }

    override fun seDeplacer() {
        println("L’avion vole dans le ciel ✈️")
    }
}

class Voiture(
    marque: String,
    modele: String,
    val annee: Int,
    val nbrRoues: Int
) : Vehicule(marque, modele) {

    override fun afficherDetails() {
        println("🚗 Voiture -> Marque : $marque, Modèle : $modele, Année : $annee, Roues : $nbrRoues")
    }

    override fun seDeplacer() {
        println("La voiture roule sur la route 🚗")
    }
}

class Velo(
    marque: String,
    modele: String,
    val nbrRoues: Int
) : Vehicule(marque, modele) {

    override fun afficherDetails() {
        println("🚴 Vélo -> Marque : $marque, Modèle : $modele, Roues : $nbrRoues")
    }

    override fun seDeplacer() {
        println("Le vélo roule avec la force des jambes 🚴")
    }
}

fun main() {
    // Création de quelques objets
    val avion1 = Avion("Airbus", "A320", 2, 8)
    val avion2 = Avion("Boeing", "747", 2, 18)

    val voiture1 = Voiture("Toyota", "Corolla", 2020, 4)
    val voiture2 = Voiture("Honda", "Civic", 2019, 4)

    val velo1 = Velo("Giant", "Escape 3", 2)
    val velo2 = Velo("Trek", "FX 2", 2)

    println("=== Tests individuels ===")
    avion1.afficherDetails()
    avion1.seDeplacer()

    voiture1.afficherDetails()
    voiture1.seDeplacer()

    velo1.afficherDetails()
    velo1.seDeplacer()

    val listeAvions = listOf(avion1, avion2)
    val listeVoitures = listOf(voiture1, voiture2)
    val listeVelos = listOf(velo1, velo2)

    println(" Liste des avions ===")
    for (a in listeAvions) a.afficherDetails()

    println(" Liste des voitures ===")
    for (v in listeVoitures) v.afficherDetails()

    println(" Liste des vélos ===")
    for (v in listeVelos) v.afficherDetails()
}
