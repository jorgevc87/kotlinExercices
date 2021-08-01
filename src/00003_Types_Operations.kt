public fun main() {
    //Any unit, and nothing types
    val anyNumbe: Any = 42
    val anyString: Any = "42"

    add()
    addUnit()

    val triple = Triple(3,2,4)
    println("El first value of triple is ${triple.first}")
    println("El second value of triple is ${triple.second}")
    println("El third value of triple is ${triple.third}")
}

fun add() {
    val result = 2 + 2
    println(result)
}

fun addUnit(): Unit {
    val result = 2 + 2
    println(result)
}