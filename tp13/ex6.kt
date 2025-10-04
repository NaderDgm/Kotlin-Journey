package tp13

fun processStrings(
    list: List<String>,
    inlineEvaluation: (String) -> Boolean,
    noinlineOperation: (String) -> Unit
) {
    list.filter(inlineEvaluation).forEach(noinlineOperation)
}
fun main(){
    val names = listOf("Nader", "Sara", "Nora", "Omar")
    processStrings(names, { it.startsWith("N") }, { println("Nom : $it") })
}