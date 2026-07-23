package com.inova.code_flow.mapper;

import com.inova.code_flow.dto.request.LessonQuizOptionRequest;
import com.inova.code_flow.dto.response.LessonQuizOptionResponse;
import com.inova.code_flow.entity.LessonQuizOption;
import com.inova.code_flow.entity.LessonQuizQuestion;
import lombok.experimental.UtilityClass;

@UtilityClass
public class LessonQuizOptionMapper {

    public LessonQuizOption toEntity(LessonQuizOptionRequest request, LessonQuizQuestion question) {
        return LessonQuizOption.builder()
                .question(question)
                .label(request.label())
                .isCorrect(request.isCorrect())
                .orderIndex(request.orderIndex())
                .build();
    }

    public LessonQuizOptionResponse toResponse(LessonQuizOption option) {
        return LessonQuizOptionResponse.builder()
                .id(option.getId())
                .questionId(option.getQuestion() != null ? option.getQuestion().getId() : null)
                .label(option.getLabel())
                .isCorrect(option.isCorrect())
                .orderIndex(option.getOrderIndex())
                .build();
    }
}