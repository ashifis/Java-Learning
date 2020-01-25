package com.BeanLifeCycle;

public class HelloWorld   {

	public HelloWorld() {
		// TODO Auto-generated constructor stub
	}
	
	private String message;

	public void getMessage() {
		System.out.println("Your message is :" + message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	public void init(){
			System.out.println("Bean is in init");
	}
	
	public  void destroy(){
		System.out.println("Bean is in destory");
	}
		

}
