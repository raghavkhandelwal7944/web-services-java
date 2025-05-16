package com.springrest.springrest.studentservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.StudentDao.StudentRepository;
import com.springrest.springrest.student.Students;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	public List<Students> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	public Students getAllStudents(int id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).orElse(null);
	}

	public Students addStudent(Students students) {
		// TODO Auto-generated method stub
		return studentRepository.save(students);
	}

	public Students updateStudent(Students students, int id) {
		// TODO Auto-generated method stub
		Optional<Students> existingStudentOpt = studentRepository.findById(id);
        if (existingStudentOpt.isPresent()) {
            Students existingStudent = existingStudentOpt.get();
            existingStudent.setId(id); // 👈 Set ID using your method
            existingStudent.setName(students.getName());
            existingStudent.setAge(students.getAge());
            existingStudent.setEmail(students.getEmail());
            return studentRepository.save(existingStudent);
        } else {
            return null; // or handle not found case
        }
	}

	public void deleteMapping(int id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
	}

	

}
