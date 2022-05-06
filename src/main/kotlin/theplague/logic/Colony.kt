package theplague.logic

import theplague.interfaces.Iconizable
import theplague.interfaces.Position

sealed class Colony : Iconizable {

    var size : Int = 1;
    abstract val primaryIcon : String
    abstract val membersToLoseByHand : Int
    abstract val membersToLoseBySword : Int

    abstract fun willReproduce() : Boolean

    fun reproduce(){
        size++;
    }

    fun needsToExpand() : Boolean{
        return size == 4;
    }

    fun attacked(weapon: Weapon){

        when(weapon){
            is Hand ->{
                size -= membersToLoseByHand;

            }
            is Sword ->{
                size -= membersToLoseBySword;
            }
        }

        if(size <=0){
            // oops, q hacemos aqui?
        }

    }


    /*
    *
    * La expansion decide una posicion dentro del radio y crea una UNICA colonia de tamaño 1 en esa posicion.
    *
    * */
    fun expand(position: Position, radius : Int) : Colonization{
        //posicion + random offset dentro del rango;


        /*
        * Recordad buscar la manera de instanciar una clase del tipo del
        *  hijo ya que Colony es abstracto y teneis que usar Ant o Dragon
        *
        * Maneras de solucionarlo:
        *
        *  - Buscar como en kotlin se puede obtener el tipo de "this" y crear una instancia en funcion de ese tipo
        *  - Hacer una copia de this y resetear sus atributos
        *  - Hacer un metodo abstracto "GetInstanceOfMyType" (cutre)
        *
        * */
        TODO()

    }


}