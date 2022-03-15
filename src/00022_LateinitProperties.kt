fun main() {

    val game = Game()

    game.init(800, 600)
    game.createScene()
}

class VideoController(var screenWidth: Int, var screenHeight: Int)

class Game {

    private lateinit var videoController: VideoController

    fun init(width: Int, height: Int) {
        videoController = VideoController(width, height)
    }

    fun createScene() {
        print("Resolución de ${videoController.screenWidth} x ${videoController.screenHeight}")
    }
}




