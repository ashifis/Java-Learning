package com.PrototypeBeanScope;

import org.springframework.context.ApplicationContext;
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
		
		ApplicationContext apctx = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld objA  = (HelloWorld) apctx.getBean("helloworld");
		objA.setMessage("Singleton Bean");
		objA.getMessage();
		HelloWorld objB = (HelloWorld) apctx.getBean("helloworld");
		objB.getMessage();

	}

}
