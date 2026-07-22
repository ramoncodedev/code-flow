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
@Table(name = "lives")
public class Live {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "link", columnDefinition = "TEXT", nullable = false)
    private String link;

    @Column(name = "scheduled_at", nullable = false)
    private LocalDateTime scheduledAt;

    @Column(name = "is_global", nullable = false)
    @Builder.Default
    private boolean isGlobal = false;

    @ManyToOne
    @JoinColumn(name = "created_by", nullable = false)
    private User createdBy;
}