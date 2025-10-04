package tp13

inline fun filterList(list: List<Int>, predicate: (Int) -> Boolean): List<Int> {
    return list.filter(predicate)
}
fun main(){
    val numbers = listOf(1, 2, 3, 4, 5)
    val evenNumbers = filterList(numbers) { it % 2 ==0}
    print(evenNumbers)
    }