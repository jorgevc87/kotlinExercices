public fun main() {

    var integer: Int = 100
    var decimal: Double = 12.5
    integer = decimal.toInt()

    println("El valor de integer es: $integer")

    println("---------------------")

    val hourlyRate: Double = 19.5
    val hoursWorked: Int = 10
    val totalCost = hourlyRate * hoursWorked.toDouble()

    println("El valor de totalCost es: $totalCost")

    println("---------------------")

    var message = "Hello" + " my name is "
    val name = "Joe"

    message += name  //Hello my name is joe

    val exclamationmark: Char = '!'
    message += exclamationmark //Hello my name is Joe!

    println(message)

    val oneThird = 1.0 / 3.0
    val oneThirdlongString = "One third is $oneThird as a decimal"

    println(oneThirdlongString)

    //MULTI LINE STRINGS
    val bigString = """
        You can have a String
        that contains multiple
        lines
        by
        doing this.
    """.trimIndent()

    println(bigString)

}