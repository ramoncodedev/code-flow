package com.inova.code_flow.dto.response;

import com.inova.code_flow.enums.Role;
import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record UserResponse(
        Long id,
        String fullName,
        String email,
        String passwordHash,
        String phone,
        Role role,
        String assignedWhatsappNumber,
        String assignedWhatsappLabel,
        LocalDateTime createdAt
) {
}
