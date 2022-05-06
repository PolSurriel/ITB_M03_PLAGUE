package theplague.logic

class Dragon : Colony() {
    override val icon: String
        get() = TODO("Not yet implemented")

    override val primaryIcon: String
        get() = "d"

    override val membersToLoseByHand: Int
        get() = 1
    override val membersToLoseBySword: Int
        get() = 2

    var turns : Int = 0;

    override fun willReproduce() : Boolean{
        // if turns++ % max == 0
        return false;
    }

}