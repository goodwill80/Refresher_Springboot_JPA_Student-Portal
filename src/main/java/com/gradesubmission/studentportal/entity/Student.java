package com.gradesubmission.studentportal.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="student")
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="name", nullable = false)
    @NonNull
    private String name;

    @Column(name="birth_date", nullable = false)
    @NonNull
    private LocalDate birthDate;


    // bidirectional
    // mapped by -  'student' object name in the object table with foreign key
    // JsonIgnore to ignore the infinite looping of foreign key object
    // Cascade - any deletion of the parent, will also remove the related child objects
    @JsonIgnore
    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Grade> grades;

}
