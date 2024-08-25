package eu.karcags.mines.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.core.screen.Screen
import eu.karcags.mines.game.GameSetting

class GameScreen(val setting: GameSetting) : Screen {
    @Composable
    override fun Content() {
        Scaffold { padding ->
            Column(
                modifier = Modifier.padding(padding)
            ) {
                Text(text = setting.caption())
            }
        }
    }
}