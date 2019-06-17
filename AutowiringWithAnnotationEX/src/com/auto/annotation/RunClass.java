package com.auto.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		College college =(College) context.getBean("text");
		
		System.out.println("collegeID is:"+college.getCollegeId()+ " CollegeName is: "+college.getCollegeName());
		System.out.println("department ID :"+college.getDepartment().getDeptId());
		System.out.println("Department Name :"+college.getDepartment().getDeptName());
	}

}
