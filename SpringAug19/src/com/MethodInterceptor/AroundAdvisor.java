package com.MethodInterceptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvisor implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		// TODO Auto-generated method stub
		
		Object obj;  
        System.out.println("additional concern before actual logic");  
        obj=arg0.proceed();  
        System.out.println("additional concern after actual logic");  
        return obj; 
	}

}
