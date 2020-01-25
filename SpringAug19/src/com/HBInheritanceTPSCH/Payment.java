package com.HBInheritanceTPSCH;

public class Payment {
	
	private Integer paymentID;
	private Double amount;
	private String paymentType;
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
