package com.MethodBeforeAdvice;


import java.lang.reflect.Method;

import org.springframework.aop.*;

public class BeforeAdvisor implements MethodBeforeAdvice{

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Additional concern before the actual logic");
		
		System.out.println("Method name:" + arg0.getName()+ " " + arg0.getModifiers());
		
		System.out.println("Argument info:");
		for (Object arg : arg1)
			System.out.println(arg);
		
		
		System.out.println("Target Object:" + arg2);
		System.out.println("Target objecct class name :"+ arg2.getClass().getName());
		
	}

}
