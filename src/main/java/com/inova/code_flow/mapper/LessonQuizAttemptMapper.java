package com.inova.code_flow.mapper;

import com.inova.code_flow.dto.request.LessonQuizAttemptRequest;
import com.inova.code_flow.dto.response.LessonQuizAttemptResponse;
import com.inova.code_flow.entity.LessonQuiz;
import com.inova.code_flow.entity.LessonQuizAttempt;
import com.inova.code_flow.entity.User;
import lombok.experimental.UtilityClass;

@UtilityClass
public class LessonQuizAttemptMapper {

    public LessonQuizAttempt toEntity(LessonQuizAttemptRequest request, LessonQuiz quiz, User student) {
        return LessonQuizAttempt.builder()
                .quiz(quiz)
                .student(student)
                .attemptNumber(request.attemptNumber())
                .score(request.score())
                .maxScore(request.maxScore())
                .passed(request.passed())
                .submittedAt(request.submittedAt())
                .build();
    }

    public LessonQuizAttemptResponse toResponse(LessonQuizAttempt attempt) {
        return LessonQuizAttemptResponse.builder()
                .id(attempt.getId())
                .quizId(attempt.getQuiz() != null ? attempt.getQuiz().getId() : null)
                .studentId(attempt.getStudent() != null ? attempt.getStudent().getId() : null)
                .studentName(attempt.getStudent() != null ? attempt.getStudent().getFullName() : null)
                .attemptNumber(attempt.getAttemptNumber())
                .score(attempt.getScore())
                .maxScore(attempt.getMaxScore())
                .passed(attempt.isPassed())
                .submittedAt(attempt.getSubmittedAt())
                .build();
    }
}