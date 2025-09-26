fun somme(num1:Int,num2:Int){
    val sum=num1+num2
    println("Resultat est : $sum")
}
fun soustraction(num1: Int,num2: Int){

    if (num1>num2){
        val sous=num1-num2
        println("Resultat est s: $sous")
    }
    if(num2>num1){
        val sous=num2-num1
        println("Resultat est s: $sous")
    }
    if (num1==num2){
        val sous=num1-num2
        println("Resultat est s: $sous")

    }
}
fun multiplication(num1: Int,num2: Int){
    val mul=num1*num2
    println("Resultat est mul : $mul")
}
fun diviser(num1: Int,num2: Int){
    val div=num1/num2
    if(num1==0/num2){
        println("Erreur, imposible de diviser ")
    }
    if(div/2==0){
        print("le nombre est pair")
    }
    if(div/2!=0){
        print("le nombre est impair")
    }

    else{println("Resultat est div : $div ")
    }
}