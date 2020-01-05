package com.RestHB.demo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="CUSTOMER")
public class Customer {

	@Id
	private Long customerId;
	
	@Column(name = "NAME", nullable = true, unique = false)
	private String name;
	
	@Column(name = "AGE", nullable = true, unique = false)
	private int age;
	
	
	
	private Date creationDate;
	
	private Date updateDate;
	
	

	public Date getCreationDate() {
		return creationDate;
	}



	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}



	public Date getUpdateDate() {
		return updateDate;
	}



	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}



	public Long getCustomerId() {
		return customerId;
	}



	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", age=" + age + ", creationDate="
				+ creationDate + ", updateDate=" + updateDate + "]";
	}
	
}
