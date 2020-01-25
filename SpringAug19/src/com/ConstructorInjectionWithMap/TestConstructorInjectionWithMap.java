package com.ConstructorInjectionWithMap;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestConstructorInjectionWithMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Resource r=new ClassPathResource("applicationContext.xml");  
		    BeanFactory factory=new XmlBeanFactory(r);  
		      
		    Questions q=(Questions)factory.getBean("q");  
		    q.displayInfo();  
	}

}
