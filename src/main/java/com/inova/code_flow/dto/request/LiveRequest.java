package com.inova.code_flow.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record LiveRequest(

        @NotBlank(message = "título é obrigatório")
        String title,

        String description,

        @NotBlank(message = "link é obrigatório")
        String link,

        @NotNull(message = "data agendada é obrigatória")
        LocalDateTime scheduledAt,

        boolean isGlobal,

        @NotNull(message = "criador é obrigatório")
        Long createdById

) {
}