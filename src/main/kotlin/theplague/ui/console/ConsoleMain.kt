package theplague.ui.console

import theplague.interfaces.IPlayer
import theplague.interfaces.ITerritory
import theplague.interfaces.Iconizable
import theplague.logic.DefaultIcon
import theplague.logic.Player
import theplague.logic.Territory
import theplague.logic.World
import java.util.*


fun main() {

    val width = 8;
    val height = 8;

    val territories: List<List<Territory>> = List<List<Territory>>(height){
        List<Territory>(width){
            Territory()
        }
    }


    val player = Player(10, 9999, DefaultIcon("P"));
    territories[player.position.y][player.position.x].icons.add(player);

    val world = World(width,height,territories, player)
    val scanner = Scanner(System.`in`)
    val worldUi = WorldUi(scanner, world)
    worldUi.play()



}