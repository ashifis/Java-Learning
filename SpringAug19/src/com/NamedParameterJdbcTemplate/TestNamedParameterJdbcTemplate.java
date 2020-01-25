package com.NamedParameterJdbcTemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestNamedParameterJdbcTemplate {

	public TestNamedParameterJdbcTemplate() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EmployeeDao edao = (EmployeeDao) ctx.getBean("edao");
		
		Employee e;
		edao.save(new Employee(888, "Tarzan", 8547));
	}

}
