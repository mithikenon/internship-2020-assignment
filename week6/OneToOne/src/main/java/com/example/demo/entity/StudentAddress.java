package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table(name="STUDENTADDRESS")
@SequenceGenerator(name="seq",initialValue=1,allocationSize=100)
public class StudentAddress {
	
	@Id
	@Column(name = "student_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	 
	private int studentId;
	
	 @Column(name="address")
	 private String address;
	 
	 @Column(name="street")
	 private String street;
	 
	 @Column(name="city")
	 private String city;
	 
	 @Column(name="state")
	 private String state;
	 
	 @Column(name="country")
	 private String country;
	 
	 @OneToOne(mappedBy = "address", cascade = CascadeType.ALL)  
	 private Student student;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	
	 
	 
	 
}
