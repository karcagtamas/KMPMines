package eu.karcags.mines.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.RadioButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment

@Composable
fun <T> RadioGroup(
    options: List<T>,
    selected: T? = null,
    textProvider: (T) -> String,
    change: (T) -> Unit
) {
    Column {
        options.forEach { option ->
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                RadioButton(selected = option == selected, onClick = {
                    change(option)
                })
                Text(textProvider(option))
            }
        }
    }
}