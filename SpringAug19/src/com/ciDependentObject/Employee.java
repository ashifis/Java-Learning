package com.ciDependentObject;

public class Employee {

	private int id;
	private String name;
	
	private Address address;//Aggregation
	
	public Employee(){
		System.out.println("No arg Cons...");
	}
	public Employee(int id, String name,Address address){
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}

	void show(){
		System.out.println("Id: "+ id +" Name :" + name);
		System.out.println(address.toString());  
	}
	
}
