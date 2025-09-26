package tp9

class UtilisateurService {
    fun afficherMessage() {
        println("Service utilisateur opérationnel.")
    }
}

class Application {
    lateinit var service: UtilisateurService

    fun initialiserService() {
        service = UtilisateurService()
    }

    fun utiliserService() {
        if (::service.isInitialized) {
            service.afficherMessage()
        } else {
            println("Service non initialisé.")
        }
    }
}

fun main() {
    val app = Application()
    app.initialiserService()
    app.utiliserService()
}