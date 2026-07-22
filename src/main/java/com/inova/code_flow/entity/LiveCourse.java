package com.inova.code_flow.entity;

import jakarta.persistence.*;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(
        name = "live_courses",
        uniqueConstraints = @UniqueConstraint(
                name = "uk_live_course",
                columnNames = {"live_id", "course_id"}
        )
)
public class LiveCourse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "live_id", nullable = false)
    private Live live;

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;
}