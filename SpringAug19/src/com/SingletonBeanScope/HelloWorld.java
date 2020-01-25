package com.SingletonBeanScope;



public class HelloWorld {

	public HelloWorld() {
		// TODO Auto-generated constructor stub
	}
	
	private String message;

	public void getMessage() {
		System.out.println("Your message :" + message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

}
