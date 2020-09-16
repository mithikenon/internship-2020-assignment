package com.employee.demo.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.demo.entity.Phone;
import com.employee.demo.repository.PhoneRepository;
@Service
public class PhoneService {
	
@Autowired
PhoneRepository phoneRepository;

public Phone save(Phone phone) {
	return phoneRepository.save(phone);
}
	
public Collection<Phone> saveAll(Collection<Phone> phones){
	        return phoneRepository.saveAll(phones);
}
}
	    


