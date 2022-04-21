package theplague.ui.console

import theplague.interfaces.IPlayer
import theplague.interfaces.ITerritory
import theplague.interfaces.Iconizable
import theplague.logic.World
import java.util.*

/*
*    override val width: Int,
    override val height: Int,
    override val territories: List<List<ITerritory>>,
    override val player: IPlayer
* */

class Territory : ITerritory{
    override fun iconList(): List<Iconizable> {
        return  List<Iconizable>(1){DefaultIcon("X")}
    }
}

class Player(
    override val turns: Int,
    override val livesLeft: Int,
    override val currentWeapon: Iconizable,
    override val currentVehicle: Iconizable
) : IPlayer {

}

class DefaultIcon(override val icon: String) : Iconizable {

}


fun main() {

    val width = 8;
    val height = 8;

    val defaultValueList = List<String>(10) {"I am default"}

    val territories: List<List<Territory>> = List<List<Territory>>(height){

        List<Territory>(width){
            Territory()
        }
    }


    val player = Player(10, 9999, DefaultIcon("P"),DefaultIcon("V"));


    val world = World(width,height,territories, player)
    val scanner = Scanner(System.`in`)
    val worldUi = WorldUi(scanner, world)
    worldUi.play()



}