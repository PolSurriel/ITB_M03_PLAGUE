// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.material.*
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.rememberWindowState
import theplague.interfaces.IWorld
import theplague.logic.DefaultIcon
import theplague.logic.Player
import theplague.logic.Territory
import theplague.logic.World
import theplague.ui.gui.MainScreen


@OptIn(ExperimentalMaterialApi::class)
fun main() = application {
    val windowState = rememberWindowState(width = 1000.dp, height = 1000.dp)
    Window(onCloseRequest = ::exitApplication, state = windowState) {
        MainScreen(createWorld())
    }
}

fun createWorld(): IWorld {

    val width = 8;
    val height = 8;

    val territories: List<List<Territory>> = List<List<Territory>>(height){

        List<Territory>(width){
            Territory()
        }
    }


    val player = Player(10, 9999, DefaultIcon("P"),DefaultIcon("V"));

    val world = World(width,height,territories, player)

    return world


}