package com.example

import com.example.models.TicTacToeGame
import com.example.plugins.configureMonitoring
import com.example.plugins.configureRouting
import com.example.plugins.configureSerialization
import com.example.plugins.configureSockets
import io.ktor.server.application.*

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {
    val game = TicTacToeGame()
    configureSockets()
    configureSerialization()
    configureMonitoring()
    configureRouting(game)
}