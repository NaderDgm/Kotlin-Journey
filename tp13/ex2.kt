package tp13

fun applyOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}
fun main(){
    val sum = applyOperation(5, 3) { x, y -> x + y }
    print(sum)
}