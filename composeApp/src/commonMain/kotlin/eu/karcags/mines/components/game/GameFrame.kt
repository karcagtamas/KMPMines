package eu.karcags.mines.components.game

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import eu.karcags.mines.game.GameSetting

@Composable
fun GameFrame(setting: GameSetting) {
    (0 until setting.size.x).forEach { x ->
        (0 until setting.size.y).forEach { y ->

        }
    }
}