package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.StudentAddress;
import com.example.demo.repository.StudentAddressRepository;

@Service
public class StudentAddressService {
	@Autowired
	StudentAddressRepository studentaddressRepository;

	public List<StudentAddress> getByStudentAddress() {
		return studentaddressRepository.findAll();
	}
	
	public StudentAddress addStudentAddress(StudentAddress address){
		return studentaddressRepository.save(address);
	}
	public StudentAddress getStudentAddressById(long id) {
		return studentaddressRepository.findById(id).orElse(null);
	}
	public void deleteStudentAddress(Long id) {
		studentaddressRepository.deleteById(id);
	}


}



