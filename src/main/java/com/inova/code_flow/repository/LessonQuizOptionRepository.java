package com.inova.code_flow.repository;

import com.inova.code_flow.entity.LessonQuizOption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LessonQuizOptionRepository extends JpaRepository<LessonQuizOption, Long> {

    List<LessonQuizOption> findByQuestionIdOrderByOrderIndexAsc(Long questionId);
}