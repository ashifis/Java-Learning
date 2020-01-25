package com.BeanLifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public MainApp() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AbstractApplicationContext  apctx = new ClassPathXmlApplicationContext("Beans.xml");
		
		HelloWorld objBean = (HelloWorld) apctx.getBean("helloworld");
		
		objBean.getMessage();
		apctx.registerShutdownHook();

	}

}
