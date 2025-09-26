package tp3

open class Personne(
    var nom:String,
    var age:Int
){
    open fun aff(){
        println("Votre infos est : $nom $age")
    }
}
open class Eleve(nom: String,age:Int, var niveau:String):Personne(nom,age){
    override fun aff(){
        println("Votre infos est : $nom $age $niveau ")
    }
}
class Employee(nom: String,age: Int,niveau: String,var post:String):Eleve(nom,age,niveau){
    override fun aff(){
        println("votre infos est : $nom $age $niveau $post")
    }

}
fun main(){
    val c1= Employee("NADER",19,"MASTER","INGENIEUR")
    c1.aff()
}









