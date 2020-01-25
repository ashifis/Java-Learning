package com.AroundAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAroundAnnotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext apl = new ClassPathXmlApplicationContext("applicationContext.xml");
		Operation op = (Operation)apl.getBean("opBean");
		op.msg();
		op.display();
		
	}

}
