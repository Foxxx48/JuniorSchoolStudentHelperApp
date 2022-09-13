package com.fox.juniorschoolstudenthelperapp.domain.repository

import com.fox.juniorschoolstudenthelperapp.domain.entity.GameSettings
import com.fox.juniorschoolstudenthelperapp.domain.entity.Level
import com.fox.juniorschoolstudenthelperapp.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}