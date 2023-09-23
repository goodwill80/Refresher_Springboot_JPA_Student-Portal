package com.gradesubmission.studentportal.repository;

import com.gradesubmission.studentportal.entity.Grade;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GradeRepository extends CrudRepository<Grade, Long> {
    Grade findByStudentIdAndCourseId(Long studentId, Long courseId);
}
