package com.inova.code_flow.dto.response;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record CourseProfessorResponse(
        Long id,
        Long courseId,
        String courseTitle,
        Long professorId,
        String professorName,
        LocalDateTime createdAt
) {
}