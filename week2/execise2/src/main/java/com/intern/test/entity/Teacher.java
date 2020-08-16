package com.intern.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="TEACHER")
@SequenceGenerator(name="seq", initialValue=1,allocationSize=100)

public class Teacher {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	long id;
	
	 @Column (name = "TEACHER_NAME")
	 String name;
	 
	 @Column (name = "TEACHER_PHONE")
	 String phone;
	 
	 @Column(name="TEACHER_DEGREE")
	 String degree;
	 
	@Column (name="TEACHER_ADDRESS")
	 String address;
	 
	 
	 public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	


}
