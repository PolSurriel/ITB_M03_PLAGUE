package theplague.logic

import theplague.interfaces.Iconizable

sealed class Item: Iconizable {
    abstract var turnLeft:Int;
    abstract var hasTurnsLimit:Boolean;

}