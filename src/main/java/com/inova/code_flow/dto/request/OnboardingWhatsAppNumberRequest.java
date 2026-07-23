package com.inova.code_flow.dto.request;

import jakarta.validation.constraints.NotBlank;

public record OnboardingWhatsAppNumberRequest(

        String label,

        @NotBlank(message = "telefone é obrigatório")
        String phone,

        boolean isActive

) {
}