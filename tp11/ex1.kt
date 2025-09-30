package TP11

fun calcul(a:Int,b:Int,operation:(Int,Int)->Int):Int{
    return operation(a,b)
}

fun main(){
    val sum=calcul(4,4){a,b->a+b}
    val soustraction=calcul(5,7){a,b->a-b}
    val mul=calcul(4,5){a,b->a*b}
    println(sum)
    println(soustraction)
    println(mul)

}
