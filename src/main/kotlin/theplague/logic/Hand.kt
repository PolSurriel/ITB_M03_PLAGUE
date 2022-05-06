package theplague.logic

class Hand : Weapon() {
    override var turnLeft: Int = -1
    override var hasTurnsLimit: Boolean = true
    override val icon: String
        get() = "mano"
}