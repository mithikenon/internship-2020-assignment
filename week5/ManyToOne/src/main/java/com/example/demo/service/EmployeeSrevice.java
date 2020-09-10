package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeSrevice {
	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<Employee> getEmployee(){
		return employeeRepository.findAll();
	}
	public Employee addEmployee(Employee employee) {
		return employeeRepository.save(employee);
		
	}
	public Employee getEmployeeById(int id) {
		return employeeRepository.findById(id).orElse(null);
		
	}
	public void deleteEmployee(int id) {
		employeeRepository.deleteById(id);
	}
	
	

}
