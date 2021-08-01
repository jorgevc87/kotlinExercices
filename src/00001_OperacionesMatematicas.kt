import kotlin.math.PI
import kotlin.math.sin
import kotlin.math.sqrt

public fun main() {
    //Comentario de una sola linea

    /*
    Comentario
    de
    muchas
    lineas
    */

    //Impresion de una cadena en la consola de kotlin
    print("Hello World from kotlin")

    //OPERACIONES ARITMETICAS
    println(2 + 6)     //SUMA
    println(10 - 2)     //SUSTRACCION
    println(2 * 4)     //MULTIPLICACION
    println(24 / 3)    //DIVISION
    println(28 % 10)    //MODULO

    //OPERACIONES CON DECIMALES
    println("")
    println(28.0 % 10.0)

    //OPERACIONES COMBINADAS
    println(((8000 / (5 * 10)) - 32) shr (29 % 5))

    //OTRAS OPERACIONES MATEMATICAS
    println(sin(45 * PI / 180))

    println(sqrt(2.0))
}






