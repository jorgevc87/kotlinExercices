fun main() {

    //Creating Maps
    val yearOfBirth = mapOf("Ana" to 1990, "Brian" to 1991, "Craig" to 1992, "Donna" to 1993)

    val namesAndScores = mutableMapOf("Anna" to 2, "Brian" to 2, "Craig" to 8, "Donna" to 6)

    println(namesAndScores)

    //Another way to create a Map
    var pairs = HashMap<String, Int>()

    //Now setting it´s capacity
    pairs = HashMap<String, Int>(20)

    //Accesing values
    println("The score of Anna is ${namesAndScores["Anna"]}")
    println("The score of Donna is ${namesAndScores.get("Donna")}")

    //modifyng maps
    val bobData = mutableMapOf(
        "name" to "Bob",
        "profession" to "CardPlayer",
        "country" to "USA"
    )

    println("The Bob´s data are: $bobData")

    //Putting new item
    bobData.put("state", "CA")
    println("Now the Bob´s data are: $bobData")

    //Putting new item
    bobData["city"] = "San Francisco"
    println("Now the Bob´s data are: $bobData")

    //Removing pairs
    bobData.remove("city") // parameter -> the key of value that you want remove
    println("Now the Bob´s daa are: $bobData")

    //Removing pairs
    bobData.remove("state", "CA") // parameter -> the key and value that you want remove
    println("Now the Bob´s daa are: $bobData")

    //Iterating through maps
    println("Iterating through maps")
    for ((player, score) in namesAndScores) {
        println("$player - $score")
    }

    //Iterating only through indexes
    println("Iterating only through indexes")
    for ((index, player) in namesAndScores){
        if(namesAndScores[index] == namesAndScores.values.last()){
            print("$player")
        }else {
            print("$player, ")
        }
    }

}


















