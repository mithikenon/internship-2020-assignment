package com.employee.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.demo.entity.Phone;
@Repository
public interface PhoneRepository extends JpaRepository<Phone,Long> { 

}
