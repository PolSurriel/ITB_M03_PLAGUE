package theplague.logic

class OnFoot : Vehicle() {
    override var turnLeft: Int = -1
    override var hasTurnsLimit: Boolean = true
    override val icon: String
        get() = "f"
}