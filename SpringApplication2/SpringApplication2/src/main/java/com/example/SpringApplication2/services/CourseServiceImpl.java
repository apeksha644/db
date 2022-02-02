package com.example.SpringApplication2.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringApplication2.dao.CourseDao;
import com.example.SpringApplication2.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;

	//List<Course> list;
	
	public CourseServiceImpl()
	{
		
//	list=new ArrayList<Course>();
//	list.add(new Course(1,"sayali","cse"));
//	list.add(new Course(2,"tabbu","IT"));
//	list.add(new Course(3,"apeksha","ENTC"));
		
		
		
	}
	
	@Override
	public List<Course> getCourses() {
		
		// TODO Auto-generated method stub
		//return list;
		return courseDao.findAll();
	}

	@Override
	public Optional< Course> getCourse(long courseId) {
		// TODO Auto-generated method stub
//		Course c=null;
//		for(Course course:list) {
//			if(course.getId() == courseId) {
//				c=course;
//				break;
//			}
//		}
//		return c;
		return courseDao.findById(courseId);
	}

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
//		list.add(course);
//		return course;
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
//		list.forEach(e ->{	
//			if(e.getId() == course.getId()) {
//		
//				e.setName(course.getName());
//				e.setDepartment(course.getDepartment());
//			}
//		});
//		return course;
		courseDao.save(course);
		return course;
	}

	@Override
	public  void  deleteCourse(long parseLong) {
		// TODO Auto-generated method stub
	//list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		Course entity=courseDao.getById(parseLong);
		courseDao.delete(entity);
		
		 
	}
	
	
	

	

}
