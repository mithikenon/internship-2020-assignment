package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepository;

@Service
public class DepartmentService {
	@Autowired
	DepartmentRepository departmentRepository;
	
	public List<Department> getDepartment(){
		return departmentRepository.findAll();
	}
	public Department addDepartment(Department department) {
		return departmentRepository.save(department);
		
	}
	public Department getDepartmentById(int id) {
		return departmentRepository.findById(id).orElse(null);
		
	}
	public void deleteDepartment(int id) {
		departmentRepository.deleteById(id);
	}
	

}
