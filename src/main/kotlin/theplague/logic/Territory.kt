package theplague.logic

import theplague.interfaces.ITerritory
import theplague.interfaces.Iconizable

class Territory : ITerritory {

    override val icons : MutableList<Iconizable> =  List<Iconizable>(1){DefaultIcon(" ")}.toMutableList()

    override fun addIcon(icon: Iconizable){

        if(icons.size == 1 && icons[0].icon == " "){
            icons.removeAt(0)
        }
        icons.add(icon);
    }

    override fun removeIcon(icon: Iconizable){

        icons.remove(icon);
    }

    override fun iconList(): List<Iconizable> {
        return icons.toList()
    }
}