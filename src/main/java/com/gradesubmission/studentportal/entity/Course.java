package com.gradesubmission.studentportal.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.Objects;

@Entity
@Table(name="course")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="subject", nullable = false)
    @NonNull
    private String subject;

    @Column(name="code", nullable = false)
    @NonNull
    private String code;

    @Column(name="description", nullable = false)
    @NonNull
    private String description;

}
