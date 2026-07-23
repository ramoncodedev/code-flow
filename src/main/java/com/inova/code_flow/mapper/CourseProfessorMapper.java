package com.inova.code_flow.mapper;

import com.inova.code_flow.dto.request.CourseProfessorRequest;
import com.inova.code_flow.dto.response.CourseProfessorResponse;
import com.inova.code_flow.entity.Course;
import com.inova.code_flow.entity.CourseProfessor;
import com.inova.code_flow.entity.User;
import lombok.experimental.UtilityClass;

@UtilityClass
public class CourseProfessorMapper {

    public CourseProfessor toEntity(CourseProfessorRequest request, Course course, User professor) {
        return CourseProfessor.builder()
                .course(course)
                .professor(professor)
                .build();
    }

    public CourseProfessorResponse toResponse(CourseProfessor courseProfessor) {
        return CourseProfessorResponse.builder()
                .id(courseProfessor.getId())
                .courseId(courseProfessor.getCourse() != null ? courseProfessor.getCourse().getId() : null)
                .courseTitle(courseProfessor.getCourse() != null ? courseProfessor.getCourse().getTitle() : null)
                .professorId(courseProfessor.getProfessor() != null ? courseProfessor.getProfessor().getId() : null)
                .professorName(courseProfessor.getProfessor() != null ? courseProfessor.getProfessor().getFullName() : null)
                .createdAt(courseProfessor.getCreatedAt())
                .build();
    }
}