package tp9

class DatabaseConnection {
    init {
        println("Connexion à la base de données établie.")
    }

    fun executerRequete() {
        println("Requête exécutée.")
    }
}

fun main() {
    val db = DatabaseConnection()
    db.executerRequete()
}