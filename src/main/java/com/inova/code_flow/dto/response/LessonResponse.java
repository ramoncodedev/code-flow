package com.inova.code_flow.dto.response;

import com.inova.code_flow.enums.ContentStatus;
import com.inova.code_flow.enums.LessonContentType;
import lombok.Builder;

@Builder
public record LessonResponse(
        Long id,
        Long moduleId,
        String title,
        Integer orderIndex,
        Integer durationMinutes,
        String videoUrl,
        LessonContentType contentType,
        String content,
        ContentStatus status
) {
}