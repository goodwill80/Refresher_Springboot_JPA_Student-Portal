package com.gradesubmission.studentportal.service;

import com.gradesubmission.studentportal.entity.Grade;
import com.gradesubmission.studentportal.entity.Student;
import com.gradesubmission.studentportal.exception.StudentNotFoundException;
import com.gradesubmission.studentportal.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImp implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student getStudentById(Long id) {
        Optional<Student> student = studentRepository.findById(id);
        return unwrapStudent(student, id);
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public List<Student> getAllStudents() {
        return (List<Student>) studentRepository.findAll();
    }

    static Student unwrapStudent(Optional<Student> entity, Long id) {
        if (entity.isPresent()) return entity.get();
        else throw new StudentNotFoundException(id);
    }


}
