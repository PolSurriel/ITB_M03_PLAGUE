package theplague.interfaces

interface IPlayer : Iconizable{
    /**
     * Turns that the player has lived
     */
    val turns : Int

    val livesLeft: Int

    /**
     * The player current weapon
     */
    var currentWeapon : Iconizable

    /**
     * The player current vehicle
     */
    var currentVehicle : Iconizable

    public var position :Position;

}