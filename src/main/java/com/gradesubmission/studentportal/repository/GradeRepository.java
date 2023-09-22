package com.gradesubmission.studentportal.repository;

import com.gradesubmission.studentportal.entity.Grade;
import org.springframework.data.repository.CrudRepository;

public interface GradeRepository extends CrudRepository<Grade, Long> {
}
