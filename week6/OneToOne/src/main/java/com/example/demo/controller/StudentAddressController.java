package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.StudentAddress;
import com.example.demo.service.StudentAddressService;


@RestController
public class StudentAddressController {
	@Autowired
	StudentAddressService studentaddressService;
	
	@GetMapping(value="/studentaddress")
	public List<StudentAddress> getStudent(){
		return studentaddressService.getByStudentAddress();
	}
	@PostMapping(value="/studentaddress")
	public StudentAddress addStudentAddress(@RequestBody StudentAddress address) {
		return studentaddressService.addStudentAddress(address);
	}
	@GetMapping(value="/studentaddress/(id)")
	public StudentAddress getStudentAddressById(@PathVariable Long id)
	{
		return studentaddressService.getStudentAddressById(id);
	}
	@DeleteMapping (value = "/studentaddress/(id)")
	public void deleteById(@PathVariable Long id)
	{
		studentaddressService.deleteStudentAddress(id);
	}

}
