package com.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainAutowireClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	TextEditor obj=(TextEditor) context.getBean("message");
	
	obj.checker();
	System.out.println("value ="+obj.getTextmessage());
	
	System.out.println("Spellchecker Vlaue"+obj.getWord().getText1());
		

	}

}
