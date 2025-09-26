package tp4

interface Animale{
    val name:String
    fun makeSound()
}
class Dog():Animale{
    override val name="Luis"
    override fun makeSound(){
        println("Urah")
    }
}
class Cat():Animale{
    override val name="Oliver"
    override fun makeSound(){
        println("Mieow")
    }
}
fun main(){
    val c1=Dog()
    c1.makeSound()
    val c2=Cat()
    c2.makeSound()
}
