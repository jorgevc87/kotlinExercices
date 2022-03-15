fun main() {
    val warriorCardCost = 5
    val randomDeckCardCost = 4

    playEffectCard(warriorCardCost, randomDeckCardCost) {
        print("Aumentar armadura por 10")
    }
}

//Pasar una funcion como argumento de otra función
fun recibirFuncion(parametro1: (String) -> Int, parametro2: Double) {

    // Invocar instancia del tipo funcion
    val numero: Int = parametro1("arg")

    print(numero)
}

// Retornar función desde otra función
fun retornarFuncion(parametro1: Int): () -> Unit {
    //el retorno es una función lambda
    return {
        println(parametro1)
    }
}

/*-------------------------------------*/
// Función de orden superior
fun playEffectCard(cardCost1: Int, cardCost2: Int, onSuccess: () -> Unit) {
    if (cardCost1 > cardCost2) {
        onSuccess()
    } else {
        println("Sin efectos")
    }
}







