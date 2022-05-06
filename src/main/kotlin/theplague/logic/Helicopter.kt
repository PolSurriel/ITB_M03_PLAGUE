package theplague.logic

class Helicopter : Vehicle() {
    override var turnLeft: Int = 5
    override var hasTurnsLimit: Boolean = true
    override val icon: String
        get() = "h"
}