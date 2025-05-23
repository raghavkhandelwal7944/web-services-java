package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;


@RestController //Representational state transfer - full form of rest
public class MyController {

	@Autowired
	private CourseService courseService;
	
	
	
	//get the courses
	@GetMapping("/courses")
	public List<Course> getCourses() {
		
		return this.courseService.getCourse();
		
		
	}
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return this.courseService.getCourse(Long.parseLong(courseId));
	}
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		
		
		return this.courseService.addCourse(course);
	}
	@PutMapping("/courses/{id}")
	public Course updateCourse(@RequestBody Course course) {
		return this.courseService.updateCourse(course);
	}
	
	@DeleteMapping("/courses/{courseId}")
	public Course deleteCourse(@PathVariable String courseId) {
		
		
		return this.courseService.deleteCourse(Long.parseLong(courseId));
		
	}
	
}
