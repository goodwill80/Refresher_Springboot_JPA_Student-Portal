package com.gradesubmission.studentportal.exception;

public class GradeNotFoundException extends RuntimeException {
    public GradeNotFoundException(Long id) {
        super("The grade id of " + id + " cannot be found!");
    }
}
