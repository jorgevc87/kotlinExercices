fun main() {

    val pow = { /*Parametros*/ base: Int, exponent: Int ->
        //Cuerpo
        Math.pow(base.toDouble(), exponent.toDouble())
    }

    println("1er ejemplo de lambda -> pow(2,4) = ${pow(2, 4)}")

    /*Se definen el tipo de dato pero no nombres para las variables de entrada*/
    val pow2: (Int, Int) -> Double = { /*Se aignan nombres para los datos de entrada*/ base, exponent ->
        Math.pow(base.toDouble(), exponent.toDouble())
    }

    println("2do ejemplo de lambda -> pow2(3,2) = ${pow2(3, 2)}")
}



