package theplague.logic

class Ant : Colony() {
    override val icon: String
        get() = primaryIcon.repeat(size)

    override val primaryIcon : String
        get() = "a"
    override val membersToLoseByHand: Int
        get() = 1
    override val membersToLoseBySword: Int
        get() = 2


    override fun willReproduce() : Boolean{
        // val valorRandom : Int = RandomRange(0, 100)
        // return valorRandom < probabilidad
        return false;
    }

}