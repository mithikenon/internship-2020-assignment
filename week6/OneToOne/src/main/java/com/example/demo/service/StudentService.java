package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
@Service
public class StudentService {
	@Autowired
	StudentRepository studentRepository;

	public List<Student> getStudent() {
		return studentRepository.findAll();
	}
	
	public Student addStudent(Student student){
		return studentRepository.save(student);
	}
	public Student getStudentById(long id) {
		return studentRepository.findById(id).orElse(null);
	}
	public void deleteStudent(Long id) {
		studentRepository.deleteById(id);
	}

}
