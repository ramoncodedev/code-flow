package com.inova.code_flow.entity;

import jakarta.persistence.*;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "lesson_quiz_options")
public class LessonQuizOption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "question_id", nullable = false)
    private LessonQuizQuestion question;

    @Column(name = "label", columnDefinition = "TEXT", nullable = false)
    private String label;

    @Column(name = "is_correct", nullable = false)
    @Builder.Default
    private boolean isCorrect = false;

    @Column(name = "order_index", nullable = false)
    @Builder.Default
    private int orderIndex = 0;
}