package com.inova.code_flow.repository;

import com.inova.code_flow.entity.OnboardingWhatsAppNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OnboardingWhatsAppNumberRepository extends JpaRepository<OnboardingWhatsAppNumber, Long> {

    Optional<OnboardingWhatsAppNumber> findByPhone(String phone);

    List<OnboardingWhatsAppNumber> findByIsActiveTrue();

    boolean existsByPhone(String phone);
}