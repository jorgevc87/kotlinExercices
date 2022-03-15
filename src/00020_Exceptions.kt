import kotlin.Exception

fun main() {
    someFunction()
}

fun someFunction() {
    anotherFunction()
}

fun anotherFunction() {
    try {
        oneMoreFunction()
    } catch (ex: Exception) {
        System.out.println("Error:\n${ex.message}")
    }
}

fun oneMoreFunction() {
    throw Exception("Some exception")
}