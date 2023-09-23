package com.gradesubmission.studentportal.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.List;
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
    @NonNull // For requiredArgsConstructor
    private String subject;

    @Column(name="code", nullable = false)
    @NonNull // For requiredArgsConstructor
    private String code;

    @Column(name="description", nullable = false)
    @NonNull
    private String description;

    @JsonIgnore
    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<Grade> grades;
}
