fun main() {
    val john = Person(firstName = "Jonny", lastName = "Applessed")

    println("Fullname of John: ${john.fullName}")
}

open class Person(var firstName: String, var lastName: String) {

    val fullName
        get() = "$firstName $lastName"

}




