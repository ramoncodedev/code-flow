package com.inova.code_flow.entity;


import com.inova.code_flow.enums.ContentStatus;
import com.inova.code_flow.enums.LessonContentType;
import jakarta.persistence.*;
import lombok.*;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "lessons")
public class LessonEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "module_id")
    private CourseModule module;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "orderIndex", columnDefinition = "TEXT")
    private Integer orderIndex;

    @Column(name = "duration_minutes")
    private Integer durationMinutes;

    @Column(name = "video_url")
    private String videoUrl;

    @Enumerated(EnumType.STRING)
    @Column(name = "content_type")
    private LessonContentType contentType;

    @Column(name = "content", columnDefinition = "TEXT")
    private String content;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private ContentStatus status;


}
