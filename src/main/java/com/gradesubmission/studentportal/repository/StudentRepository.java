package com.gradesubmission.studentportal.repository;

import com.gradesubmission.studentportal.entity.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Long> {
//    @Query(value = "SELECT * FROM student", nativeQuery = true)
//    List<Student> findTotal();
}
