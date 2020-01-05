package com.RestHB.demo;

import java.time.LocalDateTime;
import java.util.Date;

import com.RestFul26.DemoRest26.Alien;

public class CustomerRepository {
	
	private Customer customer;

	private HBUtils hbUtils = null;
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public Customer createCustomer(Customer customer) {
		hbUtils = new HBUtils(Alien.class);
		customer.setCreationDate(new Date());
		Long custOffset = 50000000L;
		
		customer.setCustomerId(customer.getCustomerId()+custOffset);
		hbUtils.saveSession(customer);
		//hbUtils.saveSession(createAccount(customer));
		hbUtils.trxBegin();
		hbUtils.trxCommit();
		hbUtils.closeSession();
		return customer;
			
	}
	
	public Account createAccount(Customer customer) {
		
		Account account = new Account();
		Long acctOffset = 70000000L;
		account.setAccountId(customer.getCustomerId() + acctOffset);
		account.setCustomerId(customer.getCustomerId());
		account.setCreationDate(new Date());
		return account;
		
	}
	
	
	
	
	

}
