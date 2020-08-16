package com.intern.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intern.test.entity.Teacher;
import com.intern.test.repository.TeacherRepository;

@Service
public class TeacherService {
	
	@Autowired
	TeacherRepository teacherRepository;

	public String getUser() {
		return "Hello all teacher";
	}
	
	public String getTeacher() {
		// TODO Auto-generated method stub
		return null;
	}
	public Teacher addTeacher(Teacher teacher){
		return teacherRepository.save(teacher);
	}
	public Teacher findById(Long id) {
		return teacherRepository.findById(id).orElse(null);
	}
	
	public void deleteTeacher(Long id) {
		teacherRepository.deleteById(id);
	}
	



}



