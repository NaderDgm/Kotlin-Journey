package tp13

fun findNumber(list: List<Int>, target: Int): Boolean {
    list.forEach {
        if (it == target) return true
    }
    return false
}
fun main(){
    val found = findNumber(listOf(10, 20, 30), 20)
    print(found)
}