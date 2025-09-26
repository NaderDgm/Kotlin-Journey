package tp10
class AlphabetRunnable : Runnable {
    override fun run() {
        for (c in 'A'..'Z') {
            println(c)
            Thread.sleep(500)
        }
    }
}
fun main() {
    val thread = Thread(AlphabetRunnable())
    thread.start()
}