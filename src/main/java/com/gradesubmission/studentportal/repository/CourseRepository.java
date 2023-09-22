package com.gradesubmission.studentportal.repository;

import com.gradesubmission.studentportal.entity.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Long> {
}
