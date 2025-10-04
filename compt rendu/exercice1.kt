package `compt rendu`

open class Personne(val nom: String, val prenom: String, val email: String) {
    fun afficherInfos() {
        println("Nom: $nom, Prénom: $prenom, Email: $email")
    }
}

class Livre(val titre: String, val auteur: String, val isbn: String, var nombreExemplaires: Int) {
    fun afficherDetails() {
        println("Titre: $titre, Auteur: $auteur, ISBN: $isbn, Exemplaires: $nombreExemplaires")
    }

    fun disponiblePourEmprunt(): Boolean = nombreExemplaires > 0

    fun mettreAJourStock(nouveauStock: Int) {
        nombreExemplaires = nouveauStock
    }
}

class Utilisateur(nom: String, prenom: String, email: String, val idUtilisateur: Int) :
    Personne(nom, prenom, email) {
    val emprunts = mutableListOf<Emprunt>()

    fun emprunterLivre(livre: Livre, dateEmprunt: String) {
        if (livre.disponiblePourEmprunt()) {
            livre.mettreAJourStock(livre.nombreExemplaires - 1)
            val emprunt = Emprunt(this, livre, dateEmprunt, null)
            emprunts.add(emprunt)
        } else {
            println("Le livre '${livre.titre}' n'est pas disponible.")
        }
    }

    fun afficherEmprunts() {
        println("Emprunts de $prenom $nom :")
        emprunts.forEach { it.afficherDetails() }
    }
}

class Emprunt(val utilisateur: Utilisateur, val livre: Livre, val dateEmprunt: String, var dateRetour: String?) {
    fun afficherDetails() {
        println("Livre: ${livre.titre}, Emprunté par: ${utilisateur.prenom}, Date: $dateEmprunt, Retour: ${dateRetour ?: "Non retourné"}")
    }

    fun retournerLivre(date: String) {
        dateRetour = date
        livre.mettreAJourStock(livre.nombreExemplaires + 1)
    }
}

abstract class GestionBibliotheque {
    val utilisateurs = mutableListOf<Utilisateur>()
    val livres = mutableListOf<Livre>()

    abstract fun ajouterUtilisateur(utilisateur: Utilisateur)
    abstract fun ajouterLivre(livre: Livre)
    abstract fun afficherTousLesLivres()
}

class Bibliotheque : GestionBibliotheque() {
    override fun ajouterUtilisateur(utilisateur: Utilisateur) {
        utilisateurs.add(utilisateur)
    }

    override fun ajouterLivre(livre: Livre) {
        livres.add(livre)
    }

    override fun afficherTousLesLivres() {
        println("Liste des livres :")
        livres.forEach { it.afficherDetails() }
    }

    fun rechercherLivreParTitre(titre: String): Livre? {
        return livres.find { it.titre.equals(titre, ignoreCase = true) }
    }
}
fun main() {
    val biblio = Bibliotheque()

    val livre1 = Livre("Kotlin pour les nuls", "Jean Dupont", "123456", 2)
    val livre2 = Livre("Android avancé", "Sophie Martin", "789101", 1)

    val user1 = Utilisateur("Doe", "John", "john@example.com", 1)
    val user2 = Utilisateur("Smith", "Anna", "anna@example.com", 2)

    biblio.ajouterLivre(livre1)
    biblio.ajouterLivre(livre2)
    biblio.ajouterUtilisateur(user1)
    biblio.ajouterUtilisateur(user2)

    user1.emprunterLivre(livre1, "2025-10-04")
    user2.emprunterLivre(livre2, "2025-10-04")

    biblio.afficherTousLesLivres()
    user1.afficherEmprunts()
    user2.afficherEmprunts()

    user1.emprunts[0].retournerLivre("2025-10-10")
    user1.afficherEmprunts()
    livre1.afficherDetails()
}