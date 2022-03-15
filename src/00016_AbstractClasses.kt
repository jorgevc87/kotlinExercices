fun main() {

}

abstract class Mammal(val birthDate: String) {
    abstract fun consumeFood()
}

class Human(birthDate: String) : Mammal(birthDate) {

    override fun consumeFood() {
        //.......
    }

    fun createbirthCertificate() {
        //......
    }
}



