package com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class GameState(
    val playerAtTurn: Char? = 'X',
    val field: GameField = emptyField(),
    val winningPlayer: Char? = null,
    val isBoardFull: Boolean = false,
    val connectedPlayers: List<Char> = emptyList()
) {

    companion object {
        /**
         * Создает пустое поле для игры
         */
        fun emptyField(): GameField {
            return GameField(
                playground = arrayOf(
                    arrayOf(null, null, null),
                    arrayOf(null, null, null),
                    arrayOf(null, null, null)
                )
            )
        }
    }
}