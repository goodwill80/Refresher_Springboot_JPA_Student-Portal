package com.gradesubmission.studentportal.exception;

public class StudentNotEnrolledException extends RuntimeException {
    public StudentNotEnrolledException(Long id) {
        super("Student of id " + id + " has not been enrolled into course!");
    }
}
