package com.PreparedStatementCallback;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPreparedStatementCallback {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");  
        
	    EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");  
	    System.out.println(dao.saveEmployeeByPreparedStatement(new Employee(108,"Amit",5000)));  

	}

}
