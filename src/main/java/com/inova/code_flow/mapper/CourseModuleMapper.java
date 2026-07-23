package com.inova.code_flow.mapper;

import com.inova.code_flow.dto.request.CourseModuleRequest;
import com.inova.code_flow.dto.response.CourseModuleResponse;
import com.inova.code_flow.entity.Course;
import com.inova.code_flow.entity.CourseModule;
import lombok.experimental.UtilityClass;

@UtilityClass
public class CourseModuleMapper {

    public CourseModule toEntity(CourseModuleRequest request, Course course) {
        return CourseModule.builder()
                .course(course)
                .title(request.title())
                .description(request.description())
                .orderIndex(request.orderIndex())
                .status(request.status())
                .build();
    }

    public CourseModuleResponse toResponse(CourseModule module) {
        return CourseModuleResponse.builder()
                .id(module.getId())
                .courseId(module.getCourse() != null ? module.getCourse().getId() : null)
                .title(module.getTitle())
                .description(module.getDescription())
                .orderIndex(module.getOrderIndex())
                .status(module.getStatus())
                .createdAt(module.getCreatedAt())
                .updatedAt(module.getUpdatedAt())
                .build();
    }
}