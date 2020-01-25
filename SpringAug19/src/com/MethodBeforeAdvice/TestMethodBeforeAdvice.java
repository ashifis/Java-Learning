package com.MethodBeforeAdvice;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestMethodBeforeAdvice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			Resource r = new ClassPathResource("applicationContext.xml");
			BeanFactory bf = new XmlBeanFactory(r);
			
			A a = bf.getBean("proxy",A.class);
			System.out.println("Proxy class name" + a.getClass().getName());
			a.m();
	}

}
