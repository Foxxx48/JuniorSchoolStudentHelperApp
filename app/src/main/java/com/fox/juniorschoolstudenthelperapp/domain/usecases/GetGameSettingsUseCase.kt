package com.fox.juniorschoolstudenthelperapp.domain.usecases

import com.fox.juniorschoolstudenthelperapp.domain.entity.GameSettings
import com.fox.juniorschoolstudenthelperapp.domain.entity.Level
import com.fox.juniorschoolstudenthelperapp.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {
    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}