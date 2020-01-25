package com.SetterInjectionWithCollection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestSetterInjectionWithCollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource r = new ClassPathResource("applicationContext.xml");
		BeanFactory bf = new XmlBeanFactory(r);
		
		Question q = (Question)bf.getBean("q");
		q.display();
		

	}

}
