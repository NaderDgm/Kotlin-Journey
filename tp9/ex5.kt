package tp9

fun calculLourd(): Int {
    println("Calcul en cours...")
    Thread.sleep(2000)
    return (1..1000000).sum()
}

val resultat by lazy { calculLourd() }

fun main() {
    println("Application prête.")
    println("Résultat : $resultat")
}