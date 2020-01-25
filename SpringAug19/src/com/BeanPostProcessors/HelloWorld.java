package com.BeanPostProcessors;

public class HelloWorld {

	public HelloWorld() {
		// TODO Auto-generated constructor stub
	}
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void init(){
		System.out.println("Bean is in init");
	}
	
	public void destroy(){
		System.out.println("Bean will be destroyed");
	}

}
