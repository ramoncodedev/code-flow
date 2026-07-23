package com.inova.code_flow.dto.response;

import lombok.Builder;

@Builder
public record LiveCourseResponse(
        Long id,
        Long liveId,
        String liveTitle,
        Long courseId,
        String courseTitle
) {
}