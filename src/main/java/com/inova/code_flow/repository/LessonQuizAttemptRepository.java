package com.inova.code_flow.repository;

import com.inova.code_flow.entity.LessonQuizAttempt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LessonQuizAttemptRepository extends JpaRepository<LessonQuizAttempt, Long> {

    List<LessonQuizAttempt> findByQuizIdAndStudentIdOrderByAttemptNumberAsc(Long quizId, Long studentId);

    long countByQuizIdAndStudentId(Long quizId, Long studentId);
}