package com.register.demo.entity;
import java.util.*;

public class Course { 
    private int CourseID; 
    private String CourseCode;
    private String CourseUnit;
    private String CourseName;
    private String DateTime;
    
    public int getCourseID() {
		return CourseID;
	}
	public void setCourseID(int courseID) {
		CourseID = courseID;
	}
	public String getCourseCode() {
		return CourseCode;
	}
	public void setCourseCode(String courseCode) {
		CourseCode = courseCode;
	}
	public String getCourseUnit() {
		return CourseUnit;
	}
	public void setCourseUnit(String courseUnit) {
		CourseUnit = courseUnit;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public String getDateTime() {
		return DateTime;
	}
	public void setDateTime(String dateTime) {
		DateTime = dateTime;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	private String Department;
    
}