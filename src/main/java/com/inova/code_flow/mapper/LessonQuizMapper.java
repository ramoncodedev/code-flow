package com.inova.code_flow.mapper;

import com.inova.code_flow.dto.request.LessonQuizRequest;
import com.inova.code_flow.dto.response.LessonQuizResponse;
import com.inova.code_flow.entity.LessonEntity;
import com.inova.code_flow.entity.LessonQuiz;
import lombok.experimental.UtilityClass;

@UtilityClass
public class LessonQuizMapper {

    public LessonQuiz toEntity(LessonQuizRequest request, LessonEntity lesson) {
        return LessonQuiz.builder()
                .lesson(lesson)
                .title(request.title())
                .instructions(request.instructions())
                .passingScore(request.passingScore())
                .maxAttempts(request.maxAttempts())
                .status(request.status())
                .build();
    }

    public LessonQuizResponse toResponse(LessonQuiz quiz) {
        return LessonQuizResponse.builder()
                .id(quiz.getId())
                .lessonId(quiz.getLesson() != null ? quiz.getLesson().getId() : null)
                .title(quiz.getTitle())
                .instructions(quiz.getInstructions())
                .passingScore(quiz.getPassingScore())
                .maxAttempts(quiz.getMaxAttempts())
                .status(quiz.getStatus())
                .build();
    }
}