package tp9

class Configuration {
    init {
        println("Configuration chargée...")
    }

    fun utiliser() {
        println("Configuration utilisée.")
    }
}

class App {
    val config: Configuration by lazy {
        Configuration()
    }

    fun lancer() {
        println("App lancée.")
        config.utiliser()
    }
}

fun main() {
    val app = App()
    app.lancer()
}