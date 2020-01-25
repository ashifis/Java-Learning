package com.ThrowsAdvice;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestThrowsAdvice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource r = new ClassPathResource("applicationContext.xml");
		
		BeanFactory bf = new XmlBeanFactory(r);
		
		Validator v = bf.getBean("proxy",Validator.class);
		   try{  
			    v.validate(12);  
			    }catch(Exception e){e.printStackTrace();}

	}

}
