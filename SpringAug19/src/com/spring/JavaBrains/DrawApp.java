package com.spring.JavaBrains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawApp {

	public DrawApp() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext applicationContext = new  ClassPathXmlApplicationContext("com/spring/JavaBrains/Beans.xml");
		
		/*
		Point p = (Point) applicationContext.getBean("pointA"); 
		System.out.println(p.toString());
		Rectangle rectangle = (Rectangle) applicationContext.getBean("rectangle");
		rectangle.draw();
		*/ 
		
		/*
		MyBeanPostProcessor myBeanPostProcessor = new MyBeanPostProcessor();
		myBeanPostProcessor.postProcessAfterInitialization(p, "pointA");
		myBeanPostProcessor.postProcessBeforeInitialization(p, "pointA");
		*/
		
		Shape shape = (Shape) applicationContext.getBean("rectangle");
		shape.draw();
		Shape shape1 = (Shape) applicationContext.getBean("circle");
		shape1.draw();
		

	}

}
