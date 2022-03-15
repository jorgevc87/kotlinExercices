fun main() {
    //val whicle = Vehicle()
}

//Example of an interface´s implementation
class Unicycle : DirectionalVehicle {
    var peddling = false

    override fun accelerate() {
        peddling = true
    }

    override fun stop() {
        peddling = false
    }

    override fun turn(direction: Direction) {

    }

    override fun description(): String {
        return ""
    }
}

interface DirectionalVehicle : Vehicle, OptionalDirectionalVehicle {
    fun description(): String
}

interface OptionalDirectionalVehicle {
    fun turn(direction: Direction = Direction.LEFT)
}

interface Vehicle {
    fun accelerate()
    fun stop()
}

enum class Direction {
    LEFT, RIGHT
}



