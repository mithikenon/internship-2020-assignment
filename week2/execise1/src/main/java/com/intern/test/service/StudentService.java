package com.intern.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intern.test.entity.Student;
import com.intern.test.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;

	public String getUser() {
		return "Hello all student";
		
	}
	
	public String getStudent() {
		// TODO Auto-generated method stub
		return null;
	}
	public Student addStudent(Student student){
		return studentRepository.save(student);
	}
	public Student findById(Long id) {
		return studentRepository.findById(id).orElse(null);
	}
	
	public void deleteStudent(Long id) {
		studentRepository.deleteById(id);
	}
	



}
