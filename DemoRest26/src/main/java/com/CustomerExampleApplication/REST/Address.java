package com.CustomerExampleApplication.REST;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import  javax.ws.rs.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="CUSTOMER_ADDRESS")
@XmlRootElement(name="address")//The @XmlRootElement(name="address") annotation maps this class to the address XML element
@XmlAccessorType(XmlAccessType.FIELD)//The @XmlAccessorType(XmlAccessType.FIELD) annotation specifies that all the fields of this class are bound to XML by default.
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	

    @XmlElement(required=true) //The @XmlElement(required=true) annotation specifies that an element must be present in the XML representation.
	protected int number;
	
    @XmlElement(required=true)
	protected String street;
	
    @XmlElement(required=true)
	protected String city;
	
    @XmlElement(required=true)
	protected String province;
	
    @XmlElement(required=true)
	protected String zip;
	
    @XmlElement(required=true)
	protected String country;

	public Address() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
	

}
