package tp4

interface Animal{
    val nom:String
    fun parler()
    fun sedeplacer()
}
interface Volant{
    fun voler()
}
class Oiseau():Animal,Volant{
    override val nom="Oliver"
    override fun sedeplacer(){
        println("je deplace")
    }
    override fun parler(){
        println("Wi-wi")
    }
    override fun voler(){
        println("je suis Voler")
    }
}
class chien():Animal{
    override val nom="jones"
    override fun parler(){
        println("Le chien ne fait pas de bruit")
    }
    override fun sedeplacer(){
        println("je deplace")
    }
}
fun main(){
    val c1=chien()
    c1.sedeplacer()
    c1.parler()

}