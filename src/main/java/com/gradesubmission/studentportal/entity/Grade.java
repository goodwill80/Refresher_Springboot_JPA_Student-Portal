package com.gradesubmission.studentportal.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="grade")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="score")
    private String score;
}
