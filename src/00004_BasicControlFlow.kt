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

    //Loops
    println("LOOPS with While")
    var sum = 1
    while (sum < 1000) {
        sum = sum + (sum + 1)

        println("Sum: $sum")
    }

    //Breaking out of a loop
    var sum2 = 1

    println("Valor inicial de sum2: $sum2")
    while (true) {
        sum2 = sum2 + (sum2 + 1)
        if (sum2 >= 1000) {
            break
        }
    }

    println("Valor final de sum2: $sum2")

    //For Loops and ranges
    val closeRange = 0..5  //0,1,2,3,4,5

    val halfOpenRange = 0 until 5  //0,1,2,3,4

    val count = 10

    var sum3 = 0
    println("Valor inicial de sum3: $sum3")
    for (i in 1..count) {
        sum3 += i
    }
    println("Valor final de sum3: $sum3")
    println()
    println()

    println("Imprimiendo un triangulo")

    val fullWidth = 11

    for (i in 0..fullWidth) {
        var stars = ""
        var sideSpace = ""
        var sideSpacesWidth = (fullWidth / 2) - i

        for (s in 1..i) {
            stars += "*"
        }

        for (j in 1..sideSpacesWidth) {
            sideSpace += " "
        }

        println("$sideSpace$stars$sideSpace")
    }
}













