package tp9

class MessageThread(private val message: String) : Runnable {
    override fun run() {
        repeat(5) {
            println("Thread [$message] - ${Thread.currentThread().name}")
            Thread.sleep(1000)
        }
    }
}

fun main() {
    val threads = listOf("A", "B", "C").map {
        Thread(MessageThread(it))
    }
    threads.forEach { it.start() }
}