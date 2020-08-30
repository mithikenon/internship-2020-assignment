package com.register.demo.repository;


import java.util.ArrayList;
import java.util.List;

import com.register.demo.controller.Course;
import com.register.demo.controller.Login;
import com.register.demo.entity.StudentEntity;

public class RegisterRepository {
	public static final List<Login> login=new ArrayList<>();
	public static final List<StudentEntity> student=new ArrayList<>();
	public static final List<Course> course=new ArrayList<>();

	public static List<Login> getLogin(){
		return login;
	}
		
		public static List<StudentEntity> getStudentEntity(){
			return student;
		}
			
			public static List<Course> getCourse(){
				return course;
			}
		
	}

