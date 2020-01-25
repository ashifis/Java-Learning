package com.HBInheritanceTPCCH;

public class Payment {
	
	private Integer paymentID;
	private Double amount;
	private String paymentType;
	private String vendor;
	public String getVendor() {
		return vendor;
	}
	
	
	
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public Integer getPaymentID() {
		return paymentID;
	}
	public void setPaymentID(Integer paymentID) {
		this.paymentID = paymentID;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	

}
