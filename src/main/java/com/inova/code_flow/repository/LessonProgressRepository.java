package com.inova.code_flow.repository;

import com.inova.code_flow.entity.LessonProgress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LessonProgressRepository extends JpaRepository<LessonProgress, Long> {

    Optional<LessonProgress> findByLessonIdAndStudentId(Long lessonId, Long studentId);

    List<LessonProgress> findByStudentId(Long studentId);

    boolean existsByLessonIdAndStudentId(Long lessonId, Long studentId);
}