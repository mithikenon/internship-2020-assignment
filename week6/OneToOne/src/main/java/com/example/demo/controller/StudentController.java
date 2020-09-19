package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService studentService;
	
	@GetMapping(value="/student")
	public List<Student> getStudent(){
		return studentService.getStudent();
	}
	@PostMapping(value="/student")
	public Student addStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}
	@GetMapping(value="/student/(id)")
	public Student getStudentById(@PathVariable Long id)
	{
		return studentService.getStudentById(id);	
	}
	@DeleteMapping (value = "/student/(id)")
	public void deleteById(@PathVariable Long id)
	{
		studentService.deleteStudent(id);
	}



}
