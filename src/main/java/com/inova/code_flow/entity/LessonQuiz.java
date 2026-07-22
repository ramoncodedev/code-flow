package com.inova.code_flow.entity;

import com.inova.code_flow.enums.ContentStatus;
import jakarta.persistence.*;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "lesson_quizzes")
public class LessonQuiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "lesson_id", unique = true, nullable = false)
    private LessonEntity lesson;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "instructions", columnDefinition = "TEXT")
    private String instructions;

    @Column(name = "passing_score", nullable = false)
    @Builder.Default
    private int passingScore = 70;

    @Column(name = "max_attempts")
    private Integer maxAttempts;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    @Builder.Default
    private ContentStatus status = ContentStatus.DRAFT;
}