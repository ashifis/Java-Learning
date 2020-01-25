package com.RowMapper;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRowMapper {

	public TestRowMapper() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EmployeeDao dao = (EmployeeDao) ctx.getBean("edao");
		
		List<Employee> list = dao.getEmployeesByRowMapper();
		
		for (Employee e:list){
			System.out.println(e);
		}

	}

}
