package com.inova.code_flow.dto.response;

import com.inova.code_flow.enums.QuizQuestionType;
import lombok.Builder;

@Builder
public record LessonQuizQuestionResponse(
        Long id,
        Long quizId,
        String prompt,
        QuizQuestionType questionType,
        int orderIndex,
        int points,
        String explanation
) {
}