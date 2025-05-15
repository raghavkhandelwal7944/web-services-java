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

}
