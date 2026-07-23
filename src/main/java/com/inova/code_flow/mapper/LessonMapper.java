package com.inova.code_flow.mapper;

import com.inova.code_flow.dto.request.LessonRequest;
import com.inova.code_flow.dto.response.LessonResponse;
import com.inova.code_flow.entity.CourseModule;
import com.inova.code_flow.entity.LessonEntity;
import lombok.experimental.UtilityClass;

@UtilityClass
public class LessonMapper {

    public LessonEntity toEntity(LessonRequest request, CourseModule module) {
        return LessonEntity.builder()
                .module(module)
                .title(request.title())
                .orderIndex(request.orderIndex())
                .durationMinutes(request.durationMinutes())
                .videoUrl(request.videoUrl())
                .contentType(request.contentType())
                .content(request.content())
                .status(request.status())
                .build();
    }

    public LessonResponse toResponse(LessonEntity lesson) {
        return LessonResponse.builder()
                .id(lesson.getId())
                .moduleId(lesson.getModule() != null ? lesson.getModule().getId() : null)
                .title(lesson.getTitle())
                .orderIndex(lesson.getOrderIndex())
                .durationMinutes(lesson.getDurationMinutes())
                .videoUrl(lesson.getVideoUrl())
                .contentType(lesson.getContentType())
                .content(lesson.getContent())
                .status(lesson.getStatus())
                .build();
    }
}