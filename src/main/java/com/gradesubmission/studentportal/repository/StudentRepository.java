package com.gradesubmission.studentportal.repository;

import com.gradesubmission.studentportal.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
