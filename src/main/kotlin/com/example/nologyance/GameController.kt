package com.example.nologyance

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GameController {

    @GetMapping("/game")
    fun getGame(): Game {
        return Game()
    }
}