package com.inova.code_flow.dto.response;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record OnboardingWhatsAppNumberResponse(
        Long id,
        String label,
        String phone,
        boolean isActive,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
}