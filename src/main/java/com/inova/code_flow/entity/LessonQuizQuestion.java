package com.inova.code_flow.entity;

import com.inova.code_flow.enums.QuizQuestionType;
import jakarta.persistence.*;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "lesson_quiz_questions")
public class LessonQuizQuestion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "quiz_id", nullable = false)
    private LessonQuiz quiz;

    @Column(name = "prompt", columnDefinition = "TEXT", nullable = false)
    private String prompt;

    @Enumerated(EnumType.STRING)
    @Column(name = "question_type", nullable = false)
    private QuizQuestionType questionType;

    @Column(name = "order_index", nullable = false)
    @Builder.Default
    private int orderIndex = 0;

    @Column(name = "points", nullable = false)
    @Builder.Default
    private int points = 1;

    @Column(name = "explanation", columnDefinition = "TEXT")
    private String explanation;
}