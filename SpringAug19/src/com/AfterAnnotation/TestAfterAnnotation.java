package com.AfterAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAfterAnnotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");  
        Operation e = (Operation) context.getBean("opBean");  
        System.out.println("calling msg...");  
        e.msg();  
        System.out.println("calling m...");  
        e.m();  
        System.out.println("calling k...");  
        e.k();  
		

	}

}
