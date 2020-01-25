package com.AJDT;

public class Student {

	private String name;
	private int age;
	public String getName() {
		
		System.out.println("Name: "+name);
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		System.out.println("Age: "+age);
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void printThrowException(){
		System.out.println("Exception raised...");
		throw new IllegalArgumentException();
	}
	
	
}
