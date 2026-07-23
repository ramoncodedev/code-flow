package com.inova.code_flow.dto.request;

import com.inova.code_flow.enums.QuizQuestionType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record LessonQuizQuestionRequest(

        @NotNull(message = "quiz é obrigatório")
        Long quizId,

        @NotBlank(message = "enunciado é obrigatório")
        String prompt,

        @NotNull(message = "tipo da questão é obrigatório")
        QuizQuestionType questionType,

        int orderIndex,

        int points,

        String explanation

) {
}