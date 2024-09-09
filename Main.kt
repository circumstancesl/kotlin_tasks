import kotlin.io.println

open class Vehicle(open var speed: Int = 0, open var name: String = "") {
    open fun start() {
        println("$name начал движение со скоростью $speed км/ч")
    }

    open fun stop() {
        println("$name остановился")
    }
}

class Boat(override var speed: Int, override var name: String) : Vehicle(speed, name) {

    override fun start() {
        println("Лодка $name начала движение по воде со скоростью $speed км/ч")
    }

    override fun stop() {
        println("Лодка $name причалила")
    }
}

class Airplane(override var speed: Int, override var name: String) : Vehicle(speed, name) {

    override fun start() {
        println("Самолет $name взлетел со скоростью $speed км/ч")
    }

    override fun stop() {
        println("Самолет $name приземлился")
    }
}

class Tank(override var speed: Int, override var name: String) : Vehicle(speed, name) {

    override fun start() {
        println("Танк $name начал движение по земле со скоростью $speed км/ч")
    }

    override fun stop() {
        println("Танк $name остановился")
    }
}

fun main() {
    val boat = Boat(20, "A")
    boat.start()
    boat.stop()

    val airplane = Airplane(1800, "B")
    airplane.start()
    airplane.stop()

    val tank = Tank(60, "D")
    tank.start()
    tank.stop()
}
