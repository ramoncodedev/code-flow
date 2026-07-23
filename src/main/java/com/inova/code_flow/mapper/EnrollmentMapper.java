package com.inova.code_flow.mapper;

import com.inova.code_flow.dto.request.EnrollmentRequest;
import com.inova.code_flow.dto.response.EnrollmentResponse;
import com.inova.code_flow.entity.Course;
import com.inova.code_flow.entity.Enrollment;
import com.inova.code_flow.entity.User;
import lombok.experimental.UtilityClass;

@UtilityClass
public class EnrollmentMapper {

    public Enrollment toEntity(EnrollmentRequest request, User student, Course course) {
        return Enrollment.builder()
                .student(student)
                .course(course)
                .registrationProcess(request.registrationProcess())
                .build();
    }

    public EnrollmentResponse toResponse(Enrollment enrollment) {
        return EnrollmentResponse.builder()
                .id(enrollment.getId())
                .studentId(enrollment.getStudent() != null ? enrollment.getStudent().getId() : null)
                .studentName(enrollment.getStudent() != null ? enrollment.getStudent().getFullName() : null)
                .courseId(enrollment.getCourse() != null ? enrollment.getCourse().getId() : null)
                .courseTitle(enrollment.getCourse() != null ? enrollment.getCourse().getTitle() : null)
                .registrationProcess(enrollment.getRegistrationProcess())
                .build();
    }
}