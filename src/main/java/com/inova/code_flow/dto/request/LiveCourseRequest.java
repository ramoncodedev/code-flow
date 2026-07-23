package com.inova.code_flow.dto.request;

import jakarta.validation.constraints.NotNull;

public record LiveCourseRequest(

        @NotNull(message = "live é obrigatória")
        Long liveId,

        @NotNull(message = "curso é obrigatório")
        Long courseId

) {
}