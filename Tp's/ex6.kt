package `Tp's`

class Maclass{
    var x:Int =23
    var y:Int=x+5
    fun aff(){
        print("Resultat est : $x $y")
    }
}

fun main(){
    val objet=Maclass()
    objet.aff()
}