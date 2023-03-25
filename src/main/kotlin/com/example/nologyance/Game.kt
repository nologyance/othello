package com.example.nologyance

import org.seasar.doma.*
import java.time.LocalDateTime

@Entity
class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int = -1

    var startTime: LocalDateTime? = null

    var endTime: LocalDateTime? = null

    var winnerId: Int? = null

    var status: Int = 0

    @Version
    var version: Int = -1
}