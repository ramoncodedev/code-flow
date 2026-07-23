package com.inova.code_flow.dto.request;

import jakarta.validation.constraints.NotNull;

public record CourseProfessorRequest(

        @NotNull(message = "curso é obrigatório")
        Long courseId,

        @NotNull(message = "professor é obrigatório")
        Long professorId

) {
}