package theplague.logic

import theplague.interfaces.IPlayer
import theplague.interfaces.Iconizable
import theplague.interfaces.Position


class Player(
    override val turns: Int,
    override val livesLeft: Int,
    override var currentWeapon: Iconizable,
) : IPlayer {

    public override var position : Position = Position(0,0);

    override val icon: String
        get() = "P"

    override var currentVehicle: Iconizable = OnFoot();


    /*
      override val icon: String
          get() = "P"
  */
}
