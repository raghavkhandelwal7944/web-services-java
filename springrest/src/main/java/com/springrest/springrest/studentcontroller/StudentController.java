package com.springrest.springrest.studentcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.student.Students;
import com.springrest.springrest.studentservice.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/students")
	public List<Students> getAllStudents(){
		return this.studentService.getAllStudents();
		
	}
	@GetMapping("/students/{id}")
	public Students getAllStudents(@PathVariable int id) {
		return this.studentService.getAllStudents(id);
	}
	
	@PostMapping("/students")
	public Students addStudent(@RequestBody Students students){
		return this.studentService.addStudent(students);
	}
	
	@PutMapping("/students/{id}")
	public Students updateStudent(@RequestBody Students student, @PathVariable int id) {
	    student.setId(id); // Set ID from path to avoid mismatch
	    return this.studentService.updateStudent(student,id);
	}

	@DeleteMapping("/students/{id}")
	public void deleteStudents(@PathVariable int id) {
		
		this.studentService.deleteMapping(id);
	}
	
}
