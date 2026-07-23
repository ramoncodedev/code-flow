package com.inova.code_flow.repository;

import com.inova.code_flow.entity.CourseProfessor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseProfessorRepository extends JpaRepository<CourseProfessor, Long> {

    List<CourseProfessor> findByCourseId(Long courseId);

    List<CourseProfessor> findByProfessorId(Long professorId);

    boolean existsByCourseIdAndProfessorId(Long courseId, Long professorId);
}