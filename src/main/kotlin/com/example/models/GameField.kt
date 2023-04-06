package com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class GameField(val playground: Array<Array<Char?>>) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as GameField

        return playground.contentDeepEquals(other.playground)
    }

    override fun hashCode(): Int {
        return playground.contentDeepHashCode()
    }
}