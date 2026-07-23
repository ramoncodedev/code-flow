package com.inova.code_flow.mapper;

import com.inova.code_flow.dto.request.LessonProgressRequest;
import com.inova.code_flow.dto.response.LessonProgressResponse;
import com.inova.code_flow.entity.LessonEntity;
import com.inova.code_flow.entity.LessonProgress;
import com.inova.code_flow.entity.User;
import lombok.experimental.UtilityClass;

@UtilityClass
public class LessonProgressMapper {

    public LessonProgress toEntity(LessonProgressRequest request, LessonEntity lesson, User student) {
        return LessonProgress.builder()
                .lesson(lesson)
                .student(student)
                .completedAt(request.completedAt())
                .build();
    }

    public LessonProgressResponse toResponse(LessonProgress progress) {
        return LessonProgressResponse.builder()
                .id(progress.getId())
                .lessonId(progress.getLesson() != null ? progress.getLesson().getId() : null)
                .lessonTitle(progress.getLesson() != null ? progress.getLesson().getTitle() : null)
                .studentId(progress.getStudent() != null ? progress.getStudent().getId() : null)
                .studentName(progress.getStudent() != null ? progress.getStudent().getFullName() : null)
                .completedAt(progress.getCompletedAt())
                .build();
    }
}