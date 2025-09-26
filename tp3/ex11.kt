package tp3

open class Forme(
    var couleur: String){
open fun affinfos(){
        print("Votre couleur est : $couleur")
    }

}
open class Cercle(couleur:String,var rayon: Double):Forme(couleur){
    override fun affinfos() {
        println("Votre infos est: $rayon $couleur")
    }


}
class Rectongle(couleur: String,rayon: Double, var largeur:Double, var hauteur:Double): Cercle(couleur,rayon){
    override fun affinfos(){
        println("Votre infos  est : $rayon $largeur $hauteur ")
    }
}


fun main(){
    val c1=Forme("red")
    val c2= Cercle("red",1.32)
    val c3= Rectongle("blue",1.1,1.2,1.2)
    c2.affinfos()
}