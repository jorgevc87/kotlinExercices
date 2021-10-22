fun main() {
    var errorCode: Int?

    errorCode = 100
    errorCode = null

    var result: Int? = 30
    println(result)

    //Error
    //println(result.plus(1))

    var authorName: String? = "Joe Howard"
    var authorAge: Int? = 24

    val ageAfterBirthDay = authorAge!! + 1
    println("After their next birtday, author will be $ageAfterBirthDay")

    //safe calls
    authorName?.let {
        val nonNullableAuthorAuthor = it
    }

    var nullableInt: Int? = 10
    var mustHaveResult = if (nullableInt != null) nullableInt else 0

    nullableInt = null
    mustHaveResult = nullableInt ?: 0

}