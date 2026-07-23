package com.inova.code_flow.mapper;

import com.inova.code_flow.dto.request.LessonQuizQuestionRequest;
import com.inova.code_flow.dto.response.LessonQuizQuestionResponse;
import com.inova.code_flow.entity.LessonQuiz;
import com.inova.code_flow.entity.LessonQuizQuestion;
import lombok.experimental.UtilityClass;

@UtilityClass
public class LessonQuizQuestionMapper {

    public LessonQuizQuestion toEntity(LessonQuizQuestionRequest request, LessonQuiz quiz) {
        return LessonQuizQuestion.builder()
                .quiz(quiz)
                .prompt(request.prompt())
                .questionType(request.questionType())
                .orderIndex(request.orderIndex())
                .points(request.points())
                .explanation(request.explanation())
                .build();
    }

    public LessonQuizQuestionResponse toResponse(LessonQuizQuestion question) {
        return LessonQuizQuestionResponse.builder()
                .id(question.getId())
                .quizId(question.getQuiz() != null ? question.getQuiz().getId() : null)
                .prompt(question.getPrompt())
                .questionType(question.getQuestionType())
                .orderIndex(question.getOrderIndex())
                .points(question.getPoints())
                .explanation(question.getExplanation())
                .build();
    }
}