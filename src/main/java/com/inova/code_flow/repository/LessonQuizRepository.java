package com.inova.code_flow.repository;

import com.inova.code_flow.entity.LessonQuiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LessonQuizRepository extends JpaRepository<LessonQuiz, Long> {

    Optional<LessonQuiz> findByLessonId(Long lessonId);
}