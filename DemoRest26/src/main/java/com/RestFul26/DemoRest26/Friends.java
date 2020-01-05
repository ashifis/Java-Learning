package com.RestFul26.DemoRest26;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="friends")
@XmlAccessorType(XmlAccessType.FIELD)
public class Friends {
	
	@XmlElement(required = true)
	protected int id;
	
	
	@XmlElement(required = true)
	protected String name;
	
	
	@XmlElement(required = true)
	protected String college;
	
	@XmlElement(required = true)
	protected int age;
	
	public Friends() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Friends [id=" + id + ", name=" + name + ", college=" + college + ", age=" + age + "]";
	}
	
	
	
	
	

}
