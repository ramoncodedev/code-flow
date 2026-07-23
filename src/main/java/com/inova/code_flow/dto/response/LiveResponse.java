package com.inova.code_flow.dto.response;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record LiveResponse(
        Long id,
        String title,
        String description,
        String link,
        LocalDateTime scheduledAt,
        boolean isGlobal,
        Long createdById,
        String createdByName
) {
}