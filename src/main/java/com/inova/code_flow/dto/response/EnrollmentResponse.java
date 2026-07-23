package com.inova.code_flow.dto.response;

import com.inova.code_flow.enums.RegistrationProcess;
import lombok.Builder;

@Builder
public record EnrollmentResponse(
        Long id,
        Long studentId,
        String studentName,
        Long courseId,
        String courseTitle,
        RegistrationProcess registrationProcess
) {
}