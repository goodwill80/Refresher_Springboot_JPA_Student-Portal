package com.gradesubmission.studentportal;

import com.gradesubmission.studentportal.entity.Course;
import com.gradesubmission.studentportal.entity.Grade;
import com.gradesubmission.studentportal.entity.Student;
import com.gradesubmission.studentportal.repository.CourseRepository;
import com.gradesubmission.studentportal.repository.GradeRepository;
import com.gradesubmission.studentportal.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class StudentPortalApplication implements CommandLineRunner {

	@Autowired
	StudentRepository studentRepository;

	@Autowired
	GradeRepository gradeRepository;

	@Autowired
	CourseRepository courseRepository;

	public static void main(String[] args) {
		SpringApplication.run(StudentPortalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// CREATE STUDENTS
		Student[] students = new Student[] {
				new Student("Harry Potter", LocalDate.parse(("1980-07-31"))),
				new Student("Ron Weasley", LocalDate.parse(("1980-03-01"))),
				new Student("Hermione Granger", LocalDate.parse(("1979-09-19"))),
				new Student("Neville Longbottom", LocalDate.parse(("1980-07-30")))
		};

		for(Student student: students) {
			studentRepository.save(student);
		}

		// CREATE COURSES
		Course[] courses = new Course[] {
				new Course("Charms", "CH104", "In this class, you will learn spells concerned with giving an object new and unexpected properties."),
				new Course("Defence Against the Dark Arts", "DADA", "In this class, you will learn defensive techniques against the dark arts."),
				new Course("Herbology", "HB311", "In this class, you will learn the study of magical plants and how to take care of, utilise and combat them."),
				new Course("History of Magic", "HIS393", "In this class, you will learn about significant events in wizarding history."),
				new Course("Potions", "POT102", "In this class, you will learn correct mixing and stirring of ingredients to create mixtures with magical effects."),
				new Course("Transfiguration", "TR442", "In this class, you will learn the art of changing the form or appearance of an object.")
		};

		for (Course course: courses) {
			courseRepository.save(course);
		}
	}
}
