package `Tp's`

fun main() {
    print("Entrez un nombre : ")
    val input = readLine()

    if (input != null) {
        val nombre = input.toInt()

        if (nombre % 2 == 0) {
            println("Le nombre est pair")
        } else {
            println("Le nombre est impair")
        }
    }
}