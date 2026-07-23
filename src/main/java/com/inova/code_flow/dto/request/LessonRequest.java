package com.inova.code_flow.dto.request;

import com.inova.code_flow.enums.ContentStatus;
import com.inova.code_flow.enums.LessonContentType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record LessonRequest(

        @NotNull(message = "módulo é obrigatório")
        Long moduleId,

        @NotBlank(message = "título é obrigatório")
        String title,

        Integer orderIndex,

        Integer durationMinutes,

        String videoUrl,

        LessonContentType contentType,

        String content,

        ContentStatus status

) {
}