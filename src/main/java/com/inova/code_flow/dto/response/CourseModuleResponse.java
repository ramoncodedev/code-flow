package com.inova.code_flow.dto.response;

import com.inova.code_flow.enums.ContentStatus;
import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record CourseModuleResponse(
        Long id,
        Long courseId,
        String title,
        String description,
        Integer orderIndex,
        ContentStatus status,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
}