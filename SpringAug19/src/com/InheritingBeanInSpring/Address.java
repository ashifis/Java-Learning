package com.InheritingBeanInSpring;

public class Address {
	
	String addressline1,state,city,country;
	
	public Address(String addressline1,String state,String city,String country ){
		
		this.addressline1 = addressline1;
		this.city = city;
		this.country = country;
		this.state = state;
		
	}
	
	public String toString(){
		System.out.println("toString called");
		return addressline1 + " " + state + " " + city + " " + country;
	}
	

}
