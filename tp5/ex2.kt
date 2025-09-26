package tp5

sealed class Result{}
data class Success(val data: String) : Result(){}
data class Error(val message: String) : Result(){}
object Loading : Result()

fun Check(result: Result) {
    when (result) {
        is Success -> println("Succès: ${result.data}")
        is Error -> println("Erreur: ${result.message}")
        Loading -> println("Chargement...")
    }
}

fun main() {
    Check(Success("Données reçues"))
    Check(Error("Pas de connexion"))
    Check(Loading)
}