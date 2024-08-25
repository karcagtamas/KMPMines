package eu.karcags.mines.screens

import androidx.compose.runtime.mutableStateOf
import cafe.adriel.voyager.core.model.ScreenModel
import cafe.adriel.voyager.core.model.screenModelScope
import cafe.adriel.voyager.navigator.Navigator
import eu.karcags.mines.game.GameSetting
import kotlinx.coroutines.launch

class HomeScreenModel : ScreenModel {

    val settings = GameSetting.entries
    private var _selectedSetting = mutableStateOf(settings.first())

    var selectedSetting = _selectedSetting

    fun changeSetting(id: Int) {
        if (selectedSetting.value.id == id) {
            return
        }

        screenModelScope.launch {
            _selectedSetting.value = settings.first { it.id == id }
        }
    }

    fun start(navigator: Navigator) {
        navigator.push(GameScreen(selectedSetting.value))
    }
}