package com.inova.code_flow.dto.response;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record LessonQuizAttemptResponse(
        Long id,
        Long quizId,
        Long studentId,
        String studentName,
        int attemptNumber,
        int score,
        int maxScore,
        boolean passed,
        LocalDateTime submittedAt
) {
}