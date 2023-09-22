package com.gradesubmission.studentportal.service;

import com.gradesubmission.studentportal.entity.Course;

import java.util.List;

public interface CourseService {
    Course getCourseById(Long id);
    Course saveCourse(Course course);
    void deleteCourse(Long id);
    List<Course> getAllCourses();
}
