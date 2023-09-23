package com.gradesubmission.studentportal.exception;

import com.gradesubmission.studentportal.repository.CourseRepository;

public class CourseNotFoundException extends RuntimeException {
    public CourseNotFoundException(Long id) {
        super("The course with id " + id + " cannot be found!");
    }
}
