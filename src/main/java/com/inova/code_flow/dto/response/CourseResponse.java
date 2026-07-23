package com.inova.code_flow.dto.response;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record CourseResponse(
        Long id,
        String title,
        String description,
        String category,
        String level,
        Integer durationHours,
        String thumbnailUrl,
        boolean isPremium,
        Integer orderIndex,
        Long professorId,
        String professorName,
        LocalDateTime createdAt
) {
}