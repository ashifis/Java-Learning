package com.AfterReturningAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAfterReturningAnnotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");  
        Operation e = (Operation) context.getBean("opBean");  
        System.out.println("calling m...");  
        System.out.println(e.m());  
        System.out.println("calling k...");  
        System.out.println(e.n());  
	}

}
