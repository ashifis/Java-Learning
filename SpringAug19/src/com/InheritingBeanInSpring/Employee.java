package com.InheritingBeanInSpring;

public class Employee {

	/**
	 * @param args
	 */
	
	
	private int id;
	private String name;
	private Address address;
	
	public Employee(){}
	public Employee(int id, String name){
		 super();  
		 System.out.println("Cons 2 :");
		this.id = id;
		this.name = name;
		
		
	}
	public Employee(int id,String name, Address address){
		 super();  
		 System.out.println("Cons 3 :");
		this.id = id;
		this.name = name;
		this.address = address;
	}
	void show(){
		System.out.println(id + " " + name);
		
		System.out.println("From  show meth");
		System.out.println(address);
	}

}
