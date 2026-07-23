package com.inova.code_flow.dto.request;

import jakarta.validation.constraints.NotBlank;

public record CourseRequest(

        @NotBlank(message = "título é obrigatório")
        String title,

        String description,

        String category,

        String level,

        Integer durationHours,

        String thumbnailUrl,

        boolean isPremium,

        Integer orderIndex,

        Long professorId

) {
}