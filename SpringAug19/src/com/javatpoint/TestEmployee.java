package com.javatpoint;

import org.springframework.core.io.*;
import org.springframework.beans.factory.BeanFactory;

import org.springframework.beans.factory.xml.XmlBeanFactory;

public class TestEmployee {
	public static void main(String[] args	){


		Resource r  = new ClassPathResource("applicationContext.xml");
		
		BeanFactory factory = new XmlBeanFactory(r);
		
		Employee e = (Employee)factory.getBean("i");
		e.show();
	
	
	}
	}
