package com.inova.code_flow.repository;

import com.inova.code_flow.entity.LessonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LessonRepository extends JpaRepository<LessonEntity, Long> {

    List<LessonEntity> findByModuleIdOrderByOrderIndexAsc(Long moduleId);
}