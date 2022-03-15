public fun main() {
    val cir = Circle(4.0)
    println("Circunference of cir: ${cir.circunference}")
}

class Circle(var radius: Double = 0.0) {
    val pi: Double by lazy {
        ((4.0 * Math.atan(1.0 / 5.0)) - Math.atan(1.0 / 239.0) * 4)
    }

    val circunference: Double
        get() = pi * radius * 2
}

