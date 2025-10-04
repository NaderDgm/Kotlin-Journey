package tp13

inline fun measureTime(taskName: String, block: () -> Unit) {
    val start = System.currentTimeMillis()
    block()
    val end = System.currentTimeMillis()
    println("$taskName executed in ${end - start} ms")
}
fun main(){
    measureTime("Calcul") {
        Thread.sleep(500)
    }
}