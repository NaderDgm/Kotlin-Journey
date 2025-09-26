package tp5
sealed class Payment(){}
class CashPayment(val amount:Int,val cardnum:Long):Payment(){}
class CardPayment(val amount:Int,val cardnum:Long):Payment(){}
class DigitalPayment(val amount: Int,val cardnum: Long):Payment(){}
fun Check(pay: Payment):String{
    val result=when(pay){
        is CashPayment -> "C'est un CashPayment "+pay.amount
        is CardPayment -> "C'est un CardPayment "+pay.amount
        is DigitalPayment -> "C'est un DigitalPayment "+pay.amount
        else -> "Ce n'est pas une Payment"

    }
    return result

}
fun main(){
    val c= CashPayment(12000,12321312321312)
    val c1= CardPayment(19000,12417984113)
    val c2= DigitalPayment(20000,21976529432526)

println(Check(pay=c))
println(Check(pay=c1))
println(Check(pay=c2))
}