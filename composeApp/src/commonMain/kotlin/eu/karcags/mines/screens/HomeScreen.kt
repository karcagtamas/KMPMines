package eu.karcags.mines.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.koin.koinScreenModel
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import eu.karcags.mines.components.AppBar
import eu.karcags.mines.components.RadioGroup

class HomeScreen : Screen {

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow
        val screenModel = koinScreenModel<HomeScreenModel>()

        Scaffold(
            topBar = {
                AppBar(title = "Mines")
            },
        ) { padding ->
            Column(
                modifier = Modifier
                    .padding(padding)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ) {
                Text("Choose Initial Settings", fontSize = MaterialTheme.typography.h4.fontSize)
                RadioGroup(
                    options = screenModel.settings,
                    selected = screenModel.selectedSetting.value,
                    { it.caption() },
                ) {
                    screenModel.changeSetting(it.id)
                }
                TextButton(
                    onClick = {
                        screenModel.start(navigator)
                    },
                ) {
                    Text(text = "Start")
                }
            }
        }
    }
}