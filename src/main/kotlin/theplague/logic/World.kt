package theplague.logic

import theplague.interfaces.*
import kotlin.math.abs
import kotlin.math.max

class DefaultIcon(override val icon: String) : Iconizable { }

class World(
    override val width: Int,
    override val height: Int,
    override val territories: List<List<ITerritory>>,
    override val player: IPlayer
): IWorld {

    override fun nextTurn() {
        //TODO("Not yet implemented")
        println("nex turn started")
    }

    override fun gameFinished(): Boolean {
        println("game finish checked")
        return player.livesLeft == 0;
    }

    override fun canMoveTo(position: Position): Boolean {
        println("can move checked")
        var canMove = false;

        val deltaMoveY = abs(position.y - player.position.y);
        val deltaMoveX = abs(position.x - player.position.x);
        val dist = max(deltaMoveY, deltaMoveX);

        when(player.currentVehicle){
            is OnFoot ->{
                canMove = dist < 3;
            }
            is Bicycle ->{
                canMove = dist < 3;
            }
            is Helicopter ->{
                canMove = dist < 3;
            }
        }
        return canMove;
    }

    override fun moveTo(position: Position) {

        println("player move")

        val lastTerr : ITerritory = territories[player.position.y][player.position.x];
        val targetTerr : ITerritory = territories[position.y][position.x];

        lastTerr.removeIcon(player);
        targetTerr.addIcon(player);

        player.position = position

    }

    override fun exterminate() {
        //TODO("Not yet implemented")
        println("exterminate")

    }

    override fun takeableItem(): Iconizable? {
        //TODO("Not yet implemented")
        println("takeableItem")

        val cell = territories[player.position.y][player.position.x];

        cell.icons.forEach {
            if(it is Item){
                return it;
            }
        }
        return null
    }

    override fun takeItem(item : Item) {
        //TODO("Not yet implemented")
        println("item taken")
        if(item is Vehicle){
            player.currentVehicle = item;
        }else if (item is Weapon) {
            player.currentWeapon = item;

        }

        val cell = territories[player.position.y][player.position.x]
        cell.removeIcon(item);
    }

}