package com.inova.code_flow.dto.response;

import lombok.Builder;

@Builder
public record LessonQuizAnswerResponse(
        Long id,
        Long attemptId,
        Long questionId,
        Long selectedOptionId,
        boolean isCorrect,
        int awardedPoints
) {
}