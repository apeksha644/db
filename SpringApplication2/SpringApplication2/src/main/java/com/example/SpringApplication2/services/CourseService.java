package com.example.SpringApplication2.services;

import java.util.List;
import java.util.Optional;

import com.example.SpringApplication2.entities.Course;

public interface CourseService {
	
	public List<Course> getCourses();

	public Optional<Course> getCourse(long  courseId);
	
	public Course addCourse(Course course);
	
	public Course updateCourse(Course course);
	
	public void deleteCourse(long parseLong);
	
	
	

}
