package com.inova.code_flow.dto.request;

import com.inova.code_flow.enums.ContentStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record LessonQuizRequest(

        @NotNull(message = "aula é obrigatória")
        Long lessonId,

        @NotBlank(message = "título é obrigatório")
        String title,

        String instructions,

        int passingScore,

        Integer maxAttempts,

        ContentStatus status

) {
}