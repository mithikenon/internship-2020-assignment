package com.employee.demo.controller;


import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.demo.entity.Employee;
import com.employee.demo.entity.Phone;
import com.employee.demo.service.EmployeeService;
import com.employee.demo.service.PhoneService;

@RestController
public class EmployeeController {
	
@Autowired
EmployeeService employeeService;

@Autowired 
PhoneService phoneService;


@GetMapping(value="/employees")
public List<Employee>findAll(){
	return employeeService.findAll();
	
	}
@PostMapping(value="/employee")
public Employee createEmployee(@RequestBody Employee employee) {
	Collection<Phone> phones=employee.getPhones();
	if(phones !=null) {
		phones=phoneService.saveAll(phones);
	}
	for(Phone phone:phones) {
		employee.addPhone(phone);
	}	
	return employeeService.save(employee);
}
	}
