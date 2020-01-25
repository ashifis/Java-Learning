package com.DependencyInjectionbySetterMethod;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestDependencyInjectionbySetterMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//C:\\Users\\ASHIF\\Desktop\\testws\\SpringAug19\\src\\com\\DependencyInjectionbySetterMethod\\
		Resource r = new ClassPathResource("C:\\Users\\ASHIF\\Desktop\\testws\\SpringAug19\\src\\com\\DependencyInjectionbySetterMethod\\applicationContext.xml");
		
		BeanFactory bf = new XmlBeanFactory(r);
		
		Employee emp = (Employee)bf.getBean("obj");
		
		emp.display();
		
		
	}

}
