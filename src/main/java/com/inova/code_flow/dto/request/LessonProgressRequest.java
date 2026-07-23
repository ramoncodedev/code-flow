package com.inova.code_flow.dto.request;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record LessonProgressRequest(

        @NotNull(message = "aula é obrigatória")
        Long lessonId,

        @NotNull(message = "estudante é obrigatório")
        Long studentId,

        @NotNull(message = "data de conclusão é obrigatória")
        LocalDateTime completedAt

) {
}