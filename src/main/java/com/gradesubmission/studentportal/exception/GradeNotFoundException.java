package com.gradesubmission.studentportal.exception;

public class GradeNotFoundException extends RuntimeException {
    public GradeNotFoundException() {
        super("The grade cannot be found!");
    }
}
