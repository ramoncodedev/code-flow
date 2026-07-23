package com.inova.code_flow.mapper;

import com.inova.code_flow.dto.request.LessonQuizAnswerRequest;
import com.inova.code_flow.dto.response.LessonQuizAnswerResponse;
import com.inova.code_flow.entity.LessonQuizAnswer;
import com.inova.code_flow.entity.LessonQuizAttempt;
import com.inova.code_flow.entity.LessonQuizOption;
import com.inova.code_flow.entity.LessonQuizQuestion;
import lombok.experimental.UtilityClass;

@UtilityClass
public class LessonQuizAnswerMapper {

    public LessonQuizAnswer toEntity(LessonQuizAnswerRequest request,
                                     LessonQuizAttempt attempt,
                                     LessonQuizQuestion question,
                                     LessonQuizOption selectedOption) {
        return LessonQuizAnswer.builder()
                .attempt(attempt)
                .question(question)
                .selectedOption(selectedOption)
                .isCorrect(request.isCorrect())
                .awardedPoints(request.awardedPoints())
                .build();
    }

    public LessonQuizAnswerResponse toResponse(LessonQuizAnswer answer) {
        return LessonQuizAnswerResponse.builder()
                .id(answer.getId())
                .attemptId(answer.getAttempt() != null ? answer.getAttempt().getId() : null)
                .questionId(answer.getQuestion() != null ? answer.getQuestion().getId() : null)
                .selectedOptionId(answer.getSelectedOption() != null ? answer.getSelectedOption().getId() : null)
                .isCorrect(answer.isCorrect())
                .awardedPoints(answer.getAwardedPoints())
                .build();
    }
}