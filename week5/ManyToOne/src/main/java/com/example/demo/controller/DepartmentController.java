package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentService;

@RestController
public class DepartmentController {
	@Autowired
	DepartmentService departmentService;

	@GetMapping(value="/department")
	public List<Department> getDepartment() {
		return departmentService.getDepartment();
	}
	@PostMapping(value="/department")
	public Department addDepartment(@RequestBody Department department) {
		return departmentService.addDepartment(department);
	}
	@GetMapping(value="/department/(id)")
	public Department getDepartmentById(@PathVariable int id){
		return departmentService.getDepartmentById(id);
	}
	@DeleteMapping(value="/department/(id)")
	public void deleteDepartmentById(@PathVariable int id){
		 departmentService.deleteDepartment(id);
	}
	

}
