fun main() {
    var multiplyLambda: (Int, Int) -> Int

    multiplyLambda = { a: Int, b: Int ->
        a * b
    }

    //fun multiply(a: Int, b: Int): Int {

    //}

    //Ejemplo de uso
    val lambdaResult = multiplyLambda(4, 2)
    println("lambdaResult: $lambdaResult")

    //Uso del keyword it
    val doubleLambda = { a: Int ->
        2 * a
    }

    //lambdas sin retorno
    var unitLambda: (a: Int) -> Unit = {
        println("Este es un lambda que no devuelve ningun valor o objeto")
    }

    unitLambda(3)

    //Ordenando un array
    val names = arrayOf("ZZZZZZZZ", "BB", "A", "CC", "EEEEEE")
    println("Array ordenado alfabeticamente: ${names.sorted()}")
    println("----------Array ordenadocon lambdas----------")

    val nameByLenght = names.sortedWith(compareBy {
        -it.length
    })

    println("Arrayordenado por el mayor lenght $nameByLenght")

    //Iterando array con lmabdas
    val values = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    values.forEach { item ->
        println("Valor del item: $item")
    }

    val prices = listOf(1.5, 10.0, 4.99, 2.30, 8.19)

    val largePrices = prices.filter { price ->
        price > 5.0
    }

    println("Precioas filtrados mayores a 5.0: $largePrices")

    val salePrices = prices.map {
        it * 0.9
    }

    println("salePrices: $salePrices")

    val userInput = listOf("0", "11", "haha", "42")
    val numbers = userInput.map {
        it.toIntOrNull()
    }

    println("solo numeros: $numbers")
}













