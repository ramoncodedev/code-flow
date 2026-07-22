package com.inova.code_flow.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(
        name = "lesson_quiz_attempts",
        uniqueConstraints = @UniqueConstraint(
                name = "uk_quiz_student_attempt",
                columnNames = {"quiz_id", "student_id", "attempt_number"}
        )
)
public class LessonQuizAttempt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "quiz_id", nullable = false)
    private LessonQuiz quiz;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private User student;

    @Column(name = "attempt_number", nullable = false)
    private int attemptNumber;

    @Column(name = "score", nullable = false)
    private int score;

    @Column(name = "max_score", nullable = false)
    private int maxScore;

    @Column(name = "passed", nullable = false)
    private boolean passed;

    @Column(name = "submitted_at", nullable = false)
    private LocalDateTime submittedAt;
}