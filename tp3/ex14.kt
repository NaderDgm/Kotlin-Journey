package tp3

open class Appareil(var marque:String,var allume: Boolean){
    init {
        println("Votre marque est : $marque ")
    }
    open fun allumer(){
        if(allume==true){
            println("Votre Appareil etait allumer")
        }
        else{
            print("rien")
        }

    }
}
open class Telephone(marque: String,allume: Boolean,var numtele:Int): Appareil(marque,allume){
    init {
        println("Votre numero de telephone est : $numtele")
    }
}
class Ordinateur(marque: String, allume: Boolean, numtele: Int,var SysExp: String): Telephone(marque,allume,numtele){
    init{
        println("Votre Sys d'exploitation est : $SysExp")
    }
}

fun main(){
    val c1= Appareil("mercedes",true)
    c1.allumer()
    val c2= Ordinateur("Dell",true,555,"Windows")
}