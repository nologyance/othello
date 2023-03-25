package com.example.nologyance

class GameDomaRepository: GameRepository {
    override fun getGame(): Game {
        return Game()
    }
}