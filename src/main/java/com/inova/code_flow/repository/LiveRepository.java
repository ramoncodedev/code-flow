package com.inova.code_flow.repository;

import com.inova.code_flow.entity.Live;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LiveRepository extends JpaRepository<Live, Long> {

    List<Live> findByIsGlobalTrue();

    List<Live> findByCreatedById(Long createdById);
}