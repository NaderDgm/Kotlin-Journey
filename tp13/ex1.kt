package tp13

fun transformList(list: List<Int>, transformation: (Int) -> Int): List<Int> {
    return list.map(transformation)
}
fun main(){
    val original = listOf(1, 2, 3, 4)
    val doubled = transformList(original) { it * 2 }
    print(doubled)
}