package eu.karcags.mines.game

import eu.karcags.mines.core.Size

enum class GameSetting(val id: Int, val size: Size, val mines: Int) {
    BASIC(1, Size(10, 10), 10),
    EXTENDED(2, Size(15, 15), 20);

    fun caption(): String {
        return "$name (${size.x} x ${size.y})"
    }
}