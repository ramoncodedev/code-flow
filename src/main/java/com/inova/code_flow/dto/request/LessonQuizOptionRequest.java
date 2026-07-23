package com.inova.code_flow.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record LessonQuizOptionRequest(

        @NotNull(message = "questão é obrigatória")
        Long questionId,

        @NotBlank(message = "texto da opção é obrigatório")
        String label,

        boolean isCorrect,

        int orderIndex

) {
}