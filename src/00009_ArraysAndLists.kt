fun main() {

    val evenNumbers = arrayOf(2, 4, 6, 8)

    /*
   Create an Array where set number of elements
   and the value
    */
    val fiveFives = Array(5, { 5 }) // 5,5,5,5,5

    val vowels = arrayOf("a", "e", "i", "o", "u")

    //arrays of primitive types
    val oddNumbers = intArrayOf(1, 3, 5, 7)

    val zeros = DoubleArray(4) //0.0, 0.0, 0.0, 0.0

    val otherOddNumbers = arrayOf(1, 3, 5, 7).toIntArray()

    //Lists
    val innerPlanetsList = listOf("Mercury", "Venus", "Earth", "Mars")

    //ArrayList
    val innerPlanetsArrayList = arrayListOf("Mercury", "Venus", "Earth", "Mars")

    //Neither innerPlanetsList nor innerPlanetsArrayList are mutables

    //-----------MUTABLE LISTS------------------
    val outerPlanets = mutableListOf("Jupiter", "Saturn", "Uranus", "Neptune")

    val exoPlanets = mutableListOf<String>()


    //accesing elements
    val players = mutableListOf("Alice", "Bob", "Cindy", "Dan")
    println("El listado está vacio? ${players.isEmpty()}")

    if (players.size < 2) {
        println("We need at least two players")
    } else {
        println("We have at least two players, Lest´s start")
    }

    //getting the first player
    var currentPlayer = players.first()

    //printing
    println("The first player is $currentPlayer")
    println("The last player is ${players.last()}")

    //getting the min
    val minPlayer = players.min()
    minPlayer.let {
        println("min player -> $minPlayer will start")
    }

    //using indexing
    val firstPlayer = players[0]
    println("First player is $firstPlayer")

    val secondPlayer = players[1]
    println("Second player is $secondPlayer")

    //val player = players[4] // Index

    //Ranges
    val upcomingPlayersSlice = players.slice(1..3)
    println(upcomingPlayersSlice.joinToString())

    //Checking for an element
    fun isEliminated(player: String): Boolean {
        return player !in players
    }

    println("Bob has been eliminated: ${isEliminated("Bob")}")

    println("Is Alice in the range 1 to 3?  ${players.slice(1..3).contains("Alice")}")

    //Appending elements
    players.add("Eli")
    players += "Gina"

    println("Players: ${players.joinToString()}")

    players.add(5, "Frank")

    println("Now players have: ${players.joinToString()}")

    val wasPlayerRemoved = players.remove("Gina")
    println("It is $wasPlayerRemoved that Gina was removed")

    println("Now players have: ${players.joinToString()}")

    var array = arrayOf(1, 2, 3)
    array += 4
    println("Array: ${array.joinToString()}")

    //Iterating trough a list
    println("Iterating trough a list")
    for (player in players) {
        println(player)
    }

    println("Iterating trough a list with index")
    for ((index, player) in players.withIndex()) {
        println("${index + 1}. $player")
    }
}