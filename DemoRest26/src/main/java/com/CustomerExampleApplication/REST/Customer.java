package com.CustomerExampleApplication.REST;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "CUSTOMER_CUSTOMER")
@NamedQuery(
	    name="findAllCustomers",
	    query="SELECT c FROM Customer c " +
	          "ORDER BY c.id"
	)
@XmlRootElement(name = "customer")
@XmlAccessorType(XmlAccessType.FIELD)
public class Customer {
	
	public Customer() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@XmlAttribute(required=true) 
	//@XmlAttribute(required=true) annotation, which maps a property to an attribute of the XML element representing the class.
	protected int id;
	
	
	@XmlElement(required = true)
	protected String firstname;
	
	@XmlElement(required = true)
	protected String lastname;
	
	@XmlElement(required = true)
	@OneToOne
	protected  Address address;
	
	@XmlElement(required = true)
	protected String email;
	
	@XmlElement(required = true)
	protected String phone;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	
}
