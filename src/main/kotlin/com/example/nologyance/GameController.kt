package com.example.nologyance

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GameController(val gameDomaRepository: GameDomaRepository) {

    @GetMapping("/game")
    fun getGame(): List<Game> {
        return gameDomaRepository.getGame()
    }
}