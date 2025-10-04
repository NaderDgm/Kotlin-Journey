package tp13

fun processList(
    list: List<Int>,
    inlinePredicate: (Int) -> Boolean,
    noinlineOperation: (Int) -> Unit
) {
    list.filter(inlinePredicate).forEach(noinlineOperation)
}
fun main(){
    processList(listOf(1, 2, 3, 4), { it > 2 }, { println("Élément : $it") })
}