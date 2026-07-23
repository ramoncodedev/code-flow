package com.inova.code_flow.repository;

import com.inova.code_flow.entity.LessonQuizQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LessonQuizQuestionRepository extends JpaRepository<LessonQuizQuestion, Long> {

    List<LessonQuizQuestion> findByQuizIdOrderByOrderIndexAsc(Long quizId);
}