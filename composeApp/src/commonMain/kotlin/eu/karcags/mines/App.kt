package eu.karcags.mines

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.transitions.SlideTransition
import eu.karcags.mines.screens.HomeScreen
import eu.karcags.mines.screens.HomeScreenModel
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.core.context.startKoin
import org.koin.dsl.module

@Composable
@Preview
fun App() {
    initKoin()

    MaterialTheme {
        Navigator(HomeScreen()) { navigator ->
            SlideTransition(navigator)
        }
    }
}

fun initKoin() {
    startKoin {
        modules(homeModule)
    }
}

val homeModule = module {
    single { HomeScreenModel() }
}