package com.example.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.entity.Teacher;
import com.example.test.repository.TeacherRepository;

@Service
public class TeacherService {
	@Autowired
	TeacherRepository teacherRepository;

	public List<Teacher> getTeacher() {
		return teacherRepository.findAll();
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
	public List<Teacher> searchTeacher(String name,String phone,String address){
		return teacherRepository.searchTeacher(name,phone,address);
	}


}
