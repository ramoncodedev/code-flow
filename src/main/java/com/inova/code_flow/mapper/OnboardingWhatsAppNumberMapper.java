package com.inova.code_flow.mapper;

import com.inova.code_flow.dto.request.OnboardingWhatsAppNumberRequest;
import com.inova.code_flow.dto.response.OnboardingWhatsAppNumberResponse;
import com.inova.code_flow.entity.OnboardingWhatsAppNumber;
import lombok.experimental.UtilityClass;

@UtilityClass
public class OnboardingWhatsAppNumberMapper {

    public OnboardingWhatsAppNumber toEntity(OnboardingWhatsAppNumberRequest request) {
        return OnboardingWhatsAppNumber.builder()
                .label(request.label())
                .phone(request.phone())
                .isActive(request.isActive())
                .build();
    }

    public OnboardingWhatsAppNumberResponse toResponse(OnboardingWhatsAppNumber number) {
        return OnboardingWhatsAppNumberResponse.builder()
                .id(number.getId())
                .label(number.getLabel())
                .phone(number.getPhone())
                .isActive(number.isActive())
                .createdAt(number.getCreatedAt())
                .updatedAt(number.getUpdatedAt())
                .build();
    }
}