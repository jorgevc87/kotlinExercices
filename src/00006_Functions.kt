fun main() {
    printMultipleOffFive(10)

    printMultipleOf(2, 3)

    //El var "suma" es de tipo funcion
    val suma = ::funcionParaSerAsignadaAunaVariable

    //Usando variable
    print("Usando la funcion desde la variable suma ${suma(3, 5)}")
}

fun printMultipleOffFive(value: Int) {
    println("$value * 5 = ${value * 5}")
}

fun printMultipleOf(multiplier: Int, andValue: Int) {
    println("$multiplier * $andValue = ${multiplier * andValue}")
}

//Funcion para ser asignada a un var o un val
fun funcionParaSerAsignadaAunaVariable(a: Int, b: Int): Int {
    return (a + b)
}

//Funcion que nunca devuelve nada
fun infiniteLoop(): Nothing {
    while (true) {

    }
}