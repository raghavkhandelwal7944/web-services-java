package com.springrest.springrest.services;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceimpl implements CourseService {
	
	List<Course> list;
	public CourseServiceimpl() {
		list=new ArrayList<>();
		list.add(new Course(145,"Java Core Course","This course contains the basics of java"));
		list.add(new Course(157,"SpringBoot Course","Creating rest api using springboot"));
	}

	@Override
	public List<Course> getCourse() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
		
		Course c=null;
		
		for(Course course:list) {
			if(course.getId()==courseId) {
				c=course;
				break;
			}
		}
		
		return c;
	}
	@Override
	public Course updateCourse(Course course) {
		for (int i = 0; i < list.size(); i++) {
	        if (list.get(i).getId() == course.getId()) {
	            list.set(i, course);
	            return course;
	        }
	    }
	    return null;	
	}
	
	@Override
	public Course deleteCourse(long courseId) {
		Course deleted = null;
	    for (Course course : list) {
	        if (course.getId() == courseId) {
	            deleted = course;
	            break;
	        }
	    }
	    if (deleted != null) {
	        list.remove(deleted);
	    }
	    return deleted;
	}

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		list.add(course);
		return course;
	}

	

}
