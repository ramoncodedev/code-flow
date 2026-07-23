package com.inova.code_flow.repository;

import com.inova.code_flow.entity.LiveCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LiveCourseRepository extends JpaRepository<LiveCourse, Long> {

    List<LiveCourse> findByLiveId(Long liveId);

    List<LiveCourse> findByCourseId(Long courseId);

    boolean existsByLiveIdAndCourseId(Long liveId, Long courseId);
}