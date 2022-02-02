package com.example.SpringApplication2.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringApplication2.entities.Course;


@Repository
public interface CourseDao extends JpaRepository<Course, Long> {
	
	Optional<Course> findById(long id);
	Optional<Course>  findByName(String name);

	
	  
}
