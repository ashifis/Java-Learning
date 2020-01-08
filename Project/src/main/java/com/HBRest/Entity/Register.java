package com.HBRest.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Register {

	@Column(name =  "FIRST_NAME" , nullable = false)
	String first_name;
	
	@Column(name =  "LAST_NAME" , nullable = false)
	String last_name;
	
	@Column(name =  "USER_NAME" , nullable = false)
	@Id
	String username;
	
	/*@Column(name =  "" , nullable = false)
	String password;*/
	@Column(name =  "ADDRESS" , nullable = false)
	String address;
	
	@Column(name =  "CONTACT" , nullable = false)
	String contact;

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
	
	
	
	
	
}
