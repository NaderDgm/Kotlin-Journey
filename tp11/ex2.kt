package TP11

fun main(){
    val nb=List(15){(0..20).random()}
    println("Liste: $nb")
    val impairs=nb.filter{it %2!==0 }
    val pairs=nb.filter{it %2==0 }
    val sp=nb.filter{it >10 }
    println("impairs $impairs")
    println("pairs $pairs")
    println("sp $sp")

}