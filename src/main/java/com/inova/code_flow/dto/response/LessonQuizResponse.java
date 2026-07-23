package com.inova.code_flow.dto.response;

import com.inova.code_flow.enums.ContentStatus;
import lombok.Builder;

@Builder
public record LessonQuizResponse(
        Long id,
        Long lessonId,
        String title,
        String instructions,
        int passingScore,
        Integer maxAttempts,
        ContentStatus status
) {
}