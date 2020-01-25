package com.AroundAnnotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class TrackOperation {
	@Pointcut("execution(* Operation.*(..))")
	public void abcPointCut(){
		
	}
	@Around("abcPointCut()")
	public Object myAdvice(ProceedingJoinPoint pjp) throws Throwable{
		Object obj;
		
		System.out.println("Before the main business logic");
		
		obj = pjp.proceed();
		
		System.out.println("After the main business logic");
		return obj;
		
		
		
		
		
		
	}
	
	
	

}
