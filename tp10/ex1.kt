package tp10

fun main() {
    val thread = Thread {
        for (i in 1..10) {
            println(i)
            Thread.sleep(1000)
        }
    }
    thread.start()
}