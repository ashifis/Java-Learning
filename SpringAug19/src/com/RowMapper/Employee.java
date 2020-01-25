package com.RowMapper;


public class Employee {

	private int age;
	private String name;
	private float salary;
	private int id;
	public  Employee() {
		
	}
	
	public Employee(int i, String string, int j) {
		// TODO Auto-generated constructor stub
		
		this.id = i;
		this.name = string;
		this.salary = j;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String toString() {
		return "id"+" "+id+ " "+"name"+" "+name+ " "+"salary"+" "+salary+ "";
	}
	
}
