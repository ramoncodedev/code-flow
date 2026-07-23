package com.inova.code_flow.mapper;

import com.inova.code_flow.dto.request.LiveCourseRequest;
import com.inova.code_flow.dto.response.LiveCourseResponse;
import com.inova.code_flow.entity.Course;
import com.inova.code_flow.entity.Live;
import com.inova.code_flow.entity.LiveCourse;
import lombok.experimental.UtilityClass;

@UtilityClass
public class LiveCourseMapper {

    public LiveCourse toEntity(LiveCourseRequest request, Live live, Course course) {
        return LiveCourse.builder()
                .live(live)
                .course(course)
                .build();
    }

    public LiveCourseResponse toResponse(LiveCourse liveCourse) {
        return LiveCourseResponse.builder()
                .id(liveCourse.getId())
                .liveId(liveCourse.getLive() != null ? liveCourse.getLive().getId() : null)
                .liveTitle(liveCourse.getLive() != null ? liveCourse.getLive().getTitle() : null)
                .courseId(liveCourse.getCourse() != null ? liveCourse.getCourse().getId() : null)
                .courseTitle(liveCourse.getCourse() != null ? liveCourse.getCourse().getTitle() : null)
                .build();
    }
}