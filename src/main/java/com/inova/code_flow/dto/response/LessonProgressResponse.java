package com.inova.code_flow.dto.response;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record LessonProgressResponse(
        Long id,
        Long lessonId,
        String lessonTitle,
        Long studentId,
        String studentName,
        LocalDateTime completedAt
) {
}