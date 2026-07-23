package com.inova.code_flow.mapper;

import com.inova.code_flow.dto.request.CourseRequest;
import com.inova.code_flow.dto.response.CourseResponse;
import com.inova.code_flow.entity.Course;
import com.inova.code_flow.entity.User;
import lombok.experimental.UtilityClass;

@UtilityClass
public class CourseMapper {

    public Course toEntity(CourseRequest request, User professor) {
        return Course.builder()
                .title(request.title())
                .description(request.description())
                .category(request.category())
                .level(request.level())
                .durationHours(request.durationHours())
                .thumbnailUrl(request.thumbnailUrl())
                .isPremium(request.isPremium())
                .orderIndex(request.orderIndex())
                .professor(professor)
                .build();
    }

    public CourseResponse toResponse(Course course) {
        return CourseResponse.builder()
                .id(course.getId())
                .title(course.getTitle())
                .description(course.getDescription())
                .category(course.getCategory())
                .level(course.getLevel())
                .durationHours(course.getDurationHours())
                .thumbnailUrl(course.getThumbnailUrl())
                .isPremium(course.isPremium())
                .orderIndex(course.getOrderIndex())
                .professorId(course.getProfessor() != null ? course.getProfessor().getId() : null)
                .professorName(course.getProfessor() != null ? course.getProfessor().getFullName() : null)
                .createdAt(course.getCreatedAt())
                .build();
    }
}