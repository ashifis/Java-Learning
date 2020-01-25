package com.ThrowsAdvice;

public class Validator {
	
	public void validate(int age) throws Exception{
		
		if (age<18){
			throw new ArithmeticException();
			
		}
		else{
			System.out.println("Voter confirmed");
		}
		
	}

}
