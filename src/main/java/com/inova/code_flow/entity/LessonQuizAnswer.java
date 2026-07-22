package com.inova.code_flow.entity;

import jakarta.persistence.*;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "lesson_quiz_answers")
public class LessonQuizAnswer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "attempt_id", nullable = false)
    private LessonQuizAttempt attempt;

    @ManyToOne
    @JoinColumn(name = "question_id", nullable = false)
    private LessonQuizQuestion question;

    @ManyToOne
    @JoinColumn(name = "selected_option_id")
    private LessonQuizOption selectedOption;

    @Column(name = "is_correct", nullable = false)
    private boolean isCorrect;

    @Column(name = "awarded_points", nullable = false)
    @Builder.Default
    private int awardedPoints = 0;
}