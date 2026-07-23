package com.inova.code_flow.dto.response;

import lombok.Builder;

@Builder
public record LessonQuizOptionResponse(
        Long id,
        Long questionId,
        String label,
        boolean isCorrect,
        int orderIndex
) {
}