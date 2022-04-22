package theplague.logic

import theplague.interfaces.*



class Territory : ITerritory{

    val icons : MutableList<Iconizable> =  List<Iconizable>(1){DefaultIcon(" ")}.toMutableList()


    override fun iconList(): List<Iconizable> {
        //return  List<Iconizable>(1){DefaultIcon(" ")}
        //return listOf(DefaultIcon("1"), DefaultIcon("2"))
        return icons.toList()
    }
}

class Player(
    override val turns: Int,
    override val livesLeft: Int,
    override val currentWeapon: Iconizable,
    override val currentVehicle: Iconizable
) : IPlayer, Iconizable {

    public var position :Position = Position(0,0);
    override val icon: String
        get() = "P"

}

class DefaultIcon(override val icon: String) : Iconizable {

}



class World(
    override val width: Int,
    override val height: Int,
    override val territories: List<List<ITerritory>>,
    override val player: IPlayer
): IWorld {

    override fun nextTurn() {
        //TODO("Not yet implemented")
    }

    override fun gameFinished(): Boolean {
        //TODO("Not yet implemented")
        return false
    }

    override fun canMoveTo(position: Position): Boolean {
        //TODO("Not yet implemented")
        return true
    }

    override fun moveTo(position: Position) {

        val lastTerr : Territory = territories[(player as Player).position.y][(player as Player).position.x] as Territory;
        val terr : Territory = territories[position.y][position.x] as Territory;

        terr.icons.add(player as Player);
        lastTerr.icons.remove(player as Player)
        player.position = Position(position.x, position.y)

    }

    override fun exterminate() {
        //TODO("Not yet implemented")
        println("exterminate")

    }

    override fun takeableItem(): Iconizable? {
        //TODO("Not yet implemented")
        return null
    }

    override fun takeItem() {
        //TODO("Not yet implemented")
    }

}