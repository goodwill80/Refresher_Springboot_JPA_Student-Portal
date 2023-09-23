package com.gradesubmission.studentportal.service;

import com.gradesubmission.studentportal.entity.Course;
import com.gradesubmission.studentportal.repository.CourseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CourseServiceImp implements CourseService {

    CourseRepository courseRepository;

    @Override
    public Course getCourseById(Long id) {
        return courseRepository.findById(id).get();
    }

    @Override
    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }

    @Override
    public List<Course> getAllCourses() {
        return (List<Course>)courseRepository.findAll();
    }
}
