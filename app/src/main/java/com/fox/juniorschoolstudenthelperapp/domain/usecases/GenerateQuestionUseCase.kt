package com.fox.juniorschoolstudenthelperapp.domain.usecases

import com.fox.juniorschoolstudenthelperapp.domain.entity.Question
import com.fox.juniorschoolstudenthelperapp.domain.repository.GameRepository

class GenerateQuestionUseCase(
    private val repository: GameRepository
) {
    operator fun invoke(maxSumValue: Int): Question {
        return repository.generateQuestion(maxSumValue, COUNT_OF_OPTIONS)
    }

    private companion object {

        const val COUNT_OF_OPTIONS = 6
    }
}