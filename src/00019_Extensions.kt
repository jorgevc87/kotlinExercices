fun main() {
    val listNmaes = listOf("Jorge", "Carmen", "Andres", "Melina")

    println(listNmaes.toBulletedList())

    val nro = 2345543
    nro.doPrint()
}

//For List of Strng items
fun List<String>.toBulletedList(): String {
    val separator = "\n- "
    return this.map { "$it" }.joinToString(separator, prefix = separator, postfix = "\n")
}

fun <EW> List<EW>.etoBulletedList(): String {
    return ""
}

fun Int.doPrint(){
    print("$this")
}

