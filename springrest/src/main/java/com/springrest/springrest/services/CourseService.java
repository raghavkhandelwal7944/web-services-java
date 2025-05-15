package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Course;

public interface CourseService {

	public List<Course> getCourse();
	
	public Course getCourse(long courseId);

	public Course addCourse(Course course);

	Course deleteCourse(long courseId);

	Course updateCourse(Course course);

}
