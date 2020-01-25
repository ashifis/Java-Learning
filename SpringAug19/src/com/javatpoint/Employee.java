package com.javatpoint;

public class Employee {
	private int id;
	private String name ;
	
	public Employee(){
		System.out.println("No arg Cons...");
	}
	public Employee(int id){
		this.id = id;
		
	}
	public Employee(String name){
		this.name = name;
	}
	public Employee(int id, String name){
		this.name = name;
		this.id = id;
	}
	
	void show(){
		System.out.println("Id: "+ id +" Name :" + name);
	}

}
