package tp10

fun main() {
    val thread = Thread {
        try {
            for (i in 1..10) {
                println("Nombre : $i")
                Thread.sleep(1000)
            }
        } catch (e: InterruptedException) {
            println("Le comptage a été interrompu.")
        }
    }
    thread.start()
    Thread.sleep(5000)
    thread.interrupt()
}