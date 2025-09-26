package tp3

open class Vehicule(
    var marque: String,
){
    init {
        println("Votre infos est : $marque")
    }

}
open class Voiture(marque: String,var nbportes:Int):Vehicule(marque){
    init {
        println("Votre infos est :  $nbportes")
    }
}
class Camion(marque: String,nbportes: Int,var capaciteCharge: String): Voiture(marque,nbportes){
    init {
        println("Votre infos est :  $capaciteCharge")
    }
}
fun main(){
    val c1= Camion("Mercedes",2,"250 kg")
}