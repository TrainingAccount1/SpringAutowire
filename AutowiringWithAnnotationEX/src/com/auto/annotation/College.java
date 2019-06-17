package com.auto.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class College {

	private int collegeId;
	private String collegeName;
	
	//@Autowired  // @Autowire annotation on Properties
	//@Qualifier("department2") // if we comment this its a normal @autowire annotation example: if we use it then the corresponding bean 
	                          //  defined in xml file will execute and @Qualifier is used to resolve the ambiguity when the when the dependency class
	                          //configured more than once in configuration(XML) file.
	private Department department;

	public int getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public Department getDepartment() {
		return department;
	}
	
	@Autowired  //annotation on constructor
	public College(@Qualifier("department1") Department department) //when you need to use @Qualifier annotation over constructor otherwise you can remove it 
	{
		System.out.println("dependancy class Department inside College Class ");
		this.department=department;
	}

	/* @Autowired               // @Autowire annotation on setter method
	@Qualifier("department2") 
	public void setDepartment(Department department) {
		this.department = department;
	} */
	
	
	
}
