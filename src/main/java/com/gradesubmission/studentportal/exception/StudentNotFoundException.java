package com.gradesubmission.studentportal.exception;

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(Long id) {
        super("The student with id " + id + " cannot be found!");
    }
}
