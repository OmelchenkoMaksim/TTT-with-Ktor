package com.example

import com.example.models.TicTacToeGame
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.server.testing.*
import kotlin.test.*
import io.ktor.http.*
import com.example.plugins.*

class ApplicationTest {
    @Test
    fun testRoot() = testApplication {
        application {
            configureRouting(game = TicTacToeGame())
        }
        client.get("/").apply {
            assertEquals(HttpStatusCode.NotFound, status)
            assertEquals("", bodyAsText())
        }
    }
}