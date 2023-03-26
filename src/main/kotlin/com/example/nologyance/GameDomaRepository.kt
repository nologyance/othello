package com.example.nologyance

import org.seasar.doma.Dao
import org.seasar.doma.Select
import org.seasar.doma.Sql
import org.seasar.doma.boot.ConfigAutowireable
import org.springframework.stereotype.Repository

@Dao
@ConfigAutowireable
interface GameDomaRepository {
    @Sql("select * from game")
    @Select
    fun getGame(): List<Game>
}