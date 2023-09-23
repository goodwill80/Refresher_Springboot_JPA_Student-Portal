package com.gradesubmission.studentportal.service;

import com.gradesubmission.studentportal.entity.Course;
import com.gradesubmission.studentportal.entity.Grade;
import com.gradesubmission.studentportal.entity.Student;
import com.gradesubmission.studentportal.repository.CourseRepository;
import com.gradesubmission.studentportal.repository.GradeRepository;
import com.gradesubmission.studentportal.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class GradeServiceImp implements GradeService {


    GradeRepository gradeRepository;
    StudentRepository studentRepository;
    CourseRepository courseRepository;

    @Override
    public Grade getGrade(Long studentId, Long courseId) {
        return gradeRepository.findByStudentIdAndCourseId(studentId, courseId);
    }

    @Override
    public Grade saveGrade(Grade grade, Long studentId, Long courseId) {
        Student student = studentRepository.findById(studentId).get();
        Course course = courseRepository.findById(courseId).get();
        grade.setStudent(student);
        grade.setCourse(course);
        return gradeRepository.save(grade);
    }

    @Override
    public Grade updateGrade(String score, Long studentId, Long courseId) {
        Grade grade = gradeRepository.findByStudentIdAndCourseId(studentId, courseId);
        grade.setScore(score);
        return gradeRepository.save(grade);
    }

    @Override
    public void deleteGrade(Long studentId, Long courseId) {

    }

    @Override
    public List<Grade> getStudentGrades(Long studentId) {
        return null;
    }

    @Override
    public List<Grade> getCourseGrades(Long courseId) {
        return null;
    }

    @Override
    public List<Grade> getAllGrades() {
        return null;
    }
}
