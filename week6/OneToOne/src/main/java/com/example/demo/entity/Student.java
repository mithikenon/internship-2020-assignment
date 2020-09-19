package com.example.demo.entity;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT")
@SequenceGenerator(name="seq",initialValue=1,allocationSize=100)
public class Student {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name = "student_id")  
	 private int id;
	 
	 @Column(name="rollno")   
	 private String rollno;
	 
	 @Column(name="firstname")   
	 private String firstname;
	 
	 @Column(name="lastname")     
	 private String lastname;
	 
	 @Column(name="course")   
	 private String course;
	 
	 @OneToOne(cascade = CascadeType.ALL)  
	 @PrimaryKeyJoinColumn 
	 private StudentAddress address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}	
	 

}
