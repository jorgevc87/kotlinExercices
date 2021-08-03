public fun main() {
    println("Basic Control Flow")
    val yes: Boolean = true
    val no: Boolean = false

    //val yes = true
    //val no = false

    val doesOneEquelTwo = (1 == 2)
    val doesOneNotEqualTwo = (1 != 2)

    val alsoTrue = !(1 == 2)

    val isOneGreaterThanTwo = (1 > 2)
    val isOneLessThanTwo = (1 < 2)

    //If expression
    if (2 > 1) {
        println("Yes, 2 is grater than 1")
    }

    val a = 5
    val b = 10
    val min = if (a < b) a else b
    val max = if (a > b) a else b

    //
    val hourOfDay = 12

    val timeOfDay = if (hourOfDay < 6) {
        "Early Monday"
    } else if (hourOfDay < 12) {
        "Morning"
    } else if (hourOfDay < 17) {
        "AfterNoon"
    } else if (hourOfDay < 20) {
        "Evening"
    } else if (hourOfDay < 24) {
        "Late evening"
    } else {
        "INVALID HOUR"
    }

    //

    var hoursWorked = 45

    var price = 0

    if (hoursWorked > 40) {
        val hoursOver40 = hoursWorked - 40
        price += hoursOver40 * 50
        hoursWorked -= hoursOver40
    }

    price += hoursWorked * 25

    println(price)
}













