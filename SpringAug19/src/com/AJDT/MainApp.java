package com.AJDT;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainApp {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Resource r = new ClassPathResource("Beans.xml");
		
		BeanFactory bf = new XmlBeanFactory(r);
		
		Student student = (Student)bf.getBean("student");
		*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	      
	      Student student = (Student) context.getBean("student");
		student.getAge();
		student.getName();
		student.printThrowException();
		
		

	}

}
