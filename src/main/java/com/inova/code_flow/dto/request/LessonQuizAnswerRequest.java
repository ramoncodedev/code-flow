package com.inova.code_flow.dto.request;

import jakarta.validation.constraints.NotNull;

public record LessonQuizAnswerRequest(

        @NotNull(message = "tentativa é obrigatória")
        Long attemptId,

        @NotNull(message = "questão é obrigatória")
        Long questionId,

        Long selectedOptionId,

        boolean isCorrect,

        int awardedPoints

) {
}