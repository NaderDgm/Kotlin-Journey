package tp4

interface Vehicle{
   fun start()
   fun stop()

}
class Car(): Vehicle{
    override fun start(){
        print("im starting")
    }
    override fun stop(){
        print("im stoping")
    }

}
class Bike(): Vehicle{
    override fun start() {print("im starting")}
    override fun stop() {print("im stoping")}
}
fun main(){
    val c1=Car()
    c1.start()
    c1.stop()
}