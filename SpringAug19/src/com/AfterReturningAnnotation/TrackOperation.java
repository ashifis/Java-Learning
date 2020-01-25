package com.AfterReturningAnnotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;



@Aspect
public class TrackOperation {

	@AfterReturning(
			pointcut = "execution(* Operation.*(..))",
			returning = "result"
			)
	public void myAdvice(JoinPoint jp, Object result){
		
		 System.out.println("additional concern");  
	        System.out.println("Method Signature: "  + jp.getSignature());  
	        System.out.println("Result in advice: "+result + 2);  
	        System.out.println("end of after returning advice...");  
		
	}
}
