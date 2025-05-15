package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;


@RestController //Representational state transfer - full form of rest
public class MyController {

	@Autowired
	private CourseService courseService;
	
	@GetMapping("/home")
	public int home() {
		int k=0;
		for(int i=0;i<10;i++) {
			System.out.println(i+1);
			k=k+i;
		}
		return k;
	}
	
	//get the courses
	@GetMapping("/courses")
	public List<Course> getCourses() {
		
		return this.courseService.getCourse();
		
		
	}
}
