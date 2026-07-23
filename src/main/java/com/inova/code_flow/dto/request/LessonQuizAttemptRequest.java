package com.inova.code_flow.dto.request;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record LessonQuizAttemptRequest(

        @NotNull(message = "quiz é obrigatório")
        Long quizId,

        @NotNull(message = "estudante é obrigatório")
        Long studentId,

        int attemptNumber,

        int score,

        int maxScore,

        boolean passed,

        @NotNull(message = "data de envio é obrigatória")
        LocalDateTime submittedAt

) {
}