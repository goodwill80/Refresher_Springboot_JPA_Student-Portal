package com.gradesubmission.studentportal.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
// Every Student id and Course id pair needs to be unique
@Table(name="grade", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"student_id", "course_id"})
})
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

    // Many grades can have only one student
    // Optional is false, as a grade cannot exist without a student
    @ManyToOne(optional = false)
    // RefColumnName is the primary key of the parent,
    @JoinColumn(name="student_id" ,referencedColumnName = "id")
    private Student student;

    @ManyToOne
    @JoinColumn(name="course_id", referencedColumnName = "id")
    private Course course;
}
