package theplague.interfaces

import theplague.logic.DefaultIcon

interface ITerritory {
    /**
     * List of icons of the current territory (4 max)
     */
    fun iconList() : List<Iconizable>

    fun addIcon(icon: Iconizable)
    fun removeIcon(icon: Iconizable)

    val icons : MutableList<Iconizable>


}