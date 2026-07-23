package com.inova.code_flow.repository;

import com.inova.code_flow.entity.LessonQuizAnswer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LessonQuizAnswerRepository extends JpaRepository<LessonQuizAnswer, Long> {

    List<LessonQuizAnswer> findByAttemptId(Long attemptId);
}