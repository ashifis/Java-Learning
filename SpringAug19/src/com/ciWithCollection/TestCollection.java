package com.ciWithCollection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestCollection {
	
	public static void main(String []args){
		
		Resource r = new ClassPathResource("applicationContext.xml");
		
		BeanFactory factory = new XmlBeanFactory(r);
		
		Question q = (Question) factory.getBean("ques");
		q.displayInfo();
		
		
	}
	

}
