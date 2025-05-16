package com.springrest.springrest.studentservice;

import java.util.List;

import com.springrest.springrest.student.Students;

public interface StudentService{

	public List<Students> getAllStudents();
	public Students getAllStudents(int id);
	public Students addStudent(Students students);
	public Students updateStudent(Students students, int id);
	public void deleteMapping(int id);
}
