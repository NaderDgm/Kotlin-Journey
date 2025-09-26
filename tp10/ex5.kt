package tp10

class Personne {
    lateinit var name: String
    val description: String by lazy { "Nom: $name" }
}
fun main() {
    val p = Personne()
    try {
        println(p.description) // Cela va lancer une exception car name N est pas initialisé
    } catch (e: UninitializedPropertyAccessException) {
        println("Erreur : name n'est pas encore initialisé.")
    }

    p.name = "Nader"
    println(p.description) // Affiche correctement la description
}