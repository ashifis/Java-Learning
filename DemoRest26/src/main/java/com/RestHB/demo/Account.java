	package com.RestHB.demo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "ACCOUNT")
public class Account {
	

	
	private Customer customer;
	
	@Column(name="CUSTOMER_ID")
	private Long customerId;
	
	@Id
	@Column(name="ACCOUNT_ID")
	private Long accountId;
	
	@Column(name = "CITY", nullable = true, unique = false)
	private String city;
	
	private Date creationDate;
	
	private Date updateDate;

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

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
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Account [customer=" + customer + ", customerId=" + customerId + ", accountId=" + accountId + ", city="
				+ city + ", creationDate=" + creationDate + ", updateDate=" + updateDate + "]";
	}
 


}
