package com.BeanPostProcessors;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanPostProcessors {

	public TestBeanPostProcessors() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AbstractApplicationContext absapctx = new ClassPathXmlApplicationContext("Beans.xml");
		
		HelloWorld hw = (HelloWorld)absapctx.getBean("helloWorld");
		System.out.println("gjgj");
		hw.getMessage();
		absapctx.registerShutdownHook();

	}

}
