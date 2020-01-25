package com.BeforeAnnotation;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class TrackOperation {
	@Pointcut("execution(* Operation.*(..))")
	public void l(){
		
	}
	@Before("l()")
	public void myAdvice(JoinPoint jp){
		System.out.println("Additional concern");
	}
	
	
	
	

}
