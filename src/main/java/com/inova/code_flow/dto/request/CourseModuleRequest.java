package com.inova.code_flow.dto.request;

import com.inova.code_flow.enums.ContentStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CourseModuleRequest(

        @NotNull(message = "curso é obrigatório")
        Long courseId,

        @NotBlank(message = "título é obrigatório")
        String title,

        String description,

        Integer orderIndex,

        ContentStatus status

) {
}