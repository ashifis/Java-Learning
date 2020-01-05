package com.RestHB.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sound.midi.MidiChannel;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriInfo;

import com.RestFul26.DemoRest26.Alien;


@Path("customers")
public class CustomerService {
	
	CustomerRepository  customerRepository = new CustomerRepository();
	
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})  //What type of data we are returning
	public Customer getCustomer() {
		System.out.println("Inside getCustomer");
		Customer customer = new Customer();
		customer.setAge(11);
		customer.setCustomerId((long) 155555555);
		customer.setName("John Doe");
		return customer;
	}
	
	
	@POST
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED})
	@Path("createcustomer")
	public  void createCustomer(@NotNull @FormParam("customerid") Long customerId,
			@NotNull @FormParam("customername") String  customerName,
			@FormParam("customerage") int customerAge) {
		System.out.println("Inside createcustomer");
		
		System.out.println(customerId + customerName + customerAge);
		Customer customer = new Customer();
		customer.setCustomerId(customerId);
		customer.setAge(customerAge);
		customer.setName("Alien");
		customerRepository.createCustomer(customer);
	}
	
	
	

}
