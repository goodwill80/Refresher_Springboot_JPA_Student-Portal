package com.gradesubmission.studentportal.service;

import com.gradesubmission.studentportal.entity.Student;

import java.util.List;

public interface StudentService {
    Student getStudentById(Long id);
    Student saveStudent(Student student);
    void deleteStudent(Long id);
    List<Student> getAllStudents();
}
