package com.gradesubmission.studentportal.service;

import com.gradesubmission.studentportal.entity.Course;
import com.gradesubmission.studentportal.entity.Grade;
import com.gradesubmission.studentportal.entity.Student;
import com.gradesubmission.studentportal.exception.GradeNotFoundException;
import com.gradesubmission.studentportal.repository.CourseRepository;
import com.gradesubmission.studentportal.repository.GradeRepository;
import com.gradesubmission.studentportal.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class GradeServiceImp implements GradeService {


    GradeRepository gradeRepository;
    StudentRepository studentRepository;
    CourseRepository courseRepository;


    @Override
    public Grade getGrade(Long studentId, Long courseId) {
        Optional<Grade> grade = gradeRepository.findByStudentIdAndCourseId(studentId, courseId);
        return unwrapGrade(grade);
    }

    @Override
    public Grade saveGrade(Grade grade, Long studentId, Long courseId) {
        Student student = StudentServiceImp.unwrapStudent(studentRepository.findById(studentId), studentId);
        Course course = CourseServiceImp.unwrapCourse(courseRepository.findById(courseId), courseId);
        grade.setStudent(student);
        grade.setCourse(course);
        return gradeRepository.save(grade);
    }

    @Override
    public Grade updateGrade(String score, Long studentId, Long courseId) {
        Optional<Grade> grade = gradeRepository.findByStudentIdAndCourseId(studentId, courseId);
        Grade foundGrade = unwrapGrade(grade);
        foundGrade.setScore(score);
        return gradeRepository.save(foundGrade);
    }

    @Override
    public void deleteGrade(Long studentId, Long courseId) {
        gradeRepository.deleteByStudentIdAndCourseId(studentId, courseId);
    }

    @Override
    public List<Grade> getStudentGrades(Long studentId) {
        return gradeRepository.findByStudentId(studentId);
    }

    @Override
    public List<Grade> getCourseGrades(Long courseId) {
        return gradeRepository.findByCourseId(courseId);
    }

    @Override
    public List<Grade> getAllGrades() {
        return (List<Grade>) gradeRepository.findAll();
    }

    static Grade unwrapGrade(Optional<Grade> entity) {
        if (entity.isPresent()) return entity.get();
        else throw new GradeNotFoundException();
    }
}
