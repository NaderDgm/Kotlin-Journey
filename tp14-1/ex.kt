package org.example

import kotlinx.coroutines.*

suspend fun verifierDisponibilite() {
    println("Vérification des ingrédients en cours...")
    delay(2000)
    println("Ingrédients disponibles ✅")
}

suspend fun preparerCommande() {
    println("Préparation de la commande en cours...")
    delay(5000)
    println("Commande préparée 🍽️")
}

suspend fun livrerRepas() = withContext(Dispatchers.IO) {
    println("Livraison du repas en cours...")
    delay(3000)
    println("Repas livré 🚗💨")
}

fun main() = runBlocking {
    println("Début du processus de commande...")


    verifierDisponibilite()


    preparerCommande()


    livrerRepas()

    println("Processus de commande terminé ✅")
}
