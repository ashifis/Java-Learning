package com.InheritingBeanInSpring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestInheritingBeanInSpring {

	public static void  main(String[] args) {  
	    Resource r=new ClassPathResource("applicationContext.xml");  
	    BeanFactory factory=new XmlBeanFactory(r);  
	      
	    Employee e1=(Employee)factory.getBean("e2");  
	    e1.show();  
	      /*
	       * <bean id="e2" class="com.InheritingBeanInSpring.Employee" parent="e1">  
<constructor-arg ref="address1"></constructor-arg>  
</bean>  
	       * 
	       * 
	       * */
	}  
	}  
