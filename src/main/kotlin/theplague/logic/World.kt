package theplague.logic

import theplague.interfaces.*
import theplague.ui.console.DefaultIcon

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
        //TODO("Not yet implemented")
    }

    override fun exterminate() {
        //TODO("Not yet implemented")
    }

    override fun takeableItem(): Iconizable? {
        //TODO("Not yet implemented")
        return DefaultIcon("D")
    }

    override fun takeItem() {
        //TODO("Not yet implemented")
    }

}