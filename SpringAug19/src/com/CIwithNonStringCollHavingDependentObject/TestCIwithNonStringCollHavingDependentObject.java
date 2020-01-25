package com.CIwithNonStringCollHavingDependentObject;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestCIwithNonStringCollHavingDependentObject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource r = new ClassPathResource("applicationContext_CIwithNonStringCollHavingDependentObject.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		
		Question q = (Question) factory.getBean("ques");
		
		q.displayInfo();

	}

}
