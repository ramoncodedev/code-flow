package com.inova.code_flow.dto.request;

import com.inova.code_flow.enums.RegistrationProcess;
import jakarta.validation.constraints.NotNull;

public record EnrollmentRequest(

        @NotNull(message = "estudante é obrigatório")
        Long studentId,

        @NotNull(message = "curso é obrigatório")
        Long courseId,

        @NotNull(message = "processo de matrícula é obrigatório")
        RegistrationProcess registrationProcess

) {
}