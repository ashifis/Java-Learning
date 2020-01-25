package com.ResultSetExtractor;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestResultSetExtractor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");  
	    EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");  
	    List<Employee> list=dao.getAllEmployees();  
	          
	    for(Employee e:list)  
	        System.out.println(e);  

	}

}
