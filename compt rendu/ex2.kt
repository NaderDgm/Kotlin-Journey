package `compt rendu`

abstract class Vehicule(
    val immatriculation: String,
    val marque: String,
    val modele: String,
    var kilometrage: Int,
    var disponible: Boolean = true
) {
    open fun afficherDetails() {
        println("Immatriculation: $immatriculation, Marque: $marque, Modèle: $modele, Km: $kilometrage, Disponible: $disponible")
    }

    fun estDisponible() = disponible
    fun marquerIndisponible() { disponible = false }
    fun marquerDisponible() { disponible = true }
    fun mettreAJourKilometrage(km: Int) { kilometrage = km }
}

class Voiture(
    immatriculation: String,
    marque: String,
    modele: String,
    kilometrage: Int,
    val nombrePortes: Int,
    val typeCarburant: String
) : Vehicule(immatriculation, marque, modele, kilometrage) {
    override fun afficherDetails() {
        super.afficherDetails()
        println("Portes: $nombrePortes, Carburant: $typeCarburant")
    }
}

class Moto(
    immatriculation: String,
    marque: String,
    modele: String,
    kilometrage: Int,
    val cylindree: Int
) : Vehicule(immatriculation, marque, modele, kilometrage) {
    override fun afficherDetails() {
        super.afficherDetails()
        println("Cylindrée: ${cylindree}cc")
    }
}

class Conducteur(val nom: String, val prenom: String, val numeroPermis: String) {
    fun afficherDetails() {
        println("Conducteur: $prenom $nom, Permis: $numeroPermis")
    }
}

class Reservation(
    val vehicule: Vehicule,
    val conducteur: Conducteur,
    val dateDebut: String,
    val dateFin: String,
    val kilometrageDebut: Int,
    var kilometrageFin: Int? = null
) {
    fun cloturerReservation(kilometrageRetour: Int) {
        kilometrageFin = kilometrageRetour
        vehicule.mettreAJourKilometrage(kilometrageRetour)
        vehicule.marquerDisponible()
    }

    fun afficherDetails() {
        println("Réservation: ${vehicule.immatriculation}, Conducteur: ${conducteur.prenom}, Du: $dateDebut au $dateFin, Km début: $kilometrageDebut, Km fin: ${kilometrageFin ?: "Non renseigné"}")
    }
}

class VehiculeIndisponibleException : Exception("Le véhicule n'est pas disponible.")
class VehiculeNonTrouveException : Exception("Véhicule introuvable.")

class ParcAutomobile {
    val vehicules = mutableListOf<Vehicule>()
    val reservations = mutableListOf<Reservation>()

    fun ajouterVehicule(vehicule: Vehicule) {
        vehicules.add(vehicule)
    }

    fun supprimerVehicule(immatriculation: String) {
        vehicules.removeIf { it.immatriculation == immatriculation }
    }

    fun reserverVehicule(
        immatriculation: String,
        conducteur: Conducteur,
        dateDebut: String,
        dateFin: String
    ) {
        val vehicule = vehicules.find { it.immatriculation == immatriculation }
            ?: throw VehiculeNonTrouveException()

        if (!vehicule.estDisponible()) throw VehiculeIndisponibleException()

        vehicule.marquerIndisponible()
        val reservation = Reservation(vehicule, conducteur, dateDebut, dateFin, vehicule.kilometrage)
        reservations.add(reservation)
    }

    fun afficherVehiculesDisponibles() {
        println("Véhicules disponibles :")
        vehicules.filter { it.estDisponible() }.forEach { it.afficherDetails() }
    }

    fun afficherReservations() {
        println("Réservations en cours :")
        reservations.forEach { it.afficherDetails() }
    }
}

fun main() {
    val parc = ParcAutomobile()

    val voiture1 = Voiture("ABC123", "Toyota", "Yaris", 50000, 5, "Essence")
    val moto1 = Moto("XYZ789", "Yamaha", "MT-07", 12000, 689)

    val conducteur1 = Conducteur("Ali", "Karim", "PERM123")
    val conducteur2 = Conducteur("Lina", "Ben", "PERM456")

    parc.ajouterVehicule(voiture1)
    parc.ajouterVehicule(moto1)

    parc.reserverVehicule("ABC123", conducteur1, "2025-10-04", "2025-10-10")
    parc.reserverVehicule("XYZ789", conducteur2, "2025-10-05", "2025-10-12")

    parc.afficherVehiculesDisponibles()
    parc.afficherReservations()

    parc.reservations[0].cloturerReservation(50500)
    parc.afficherVehiculesDisponibles()}