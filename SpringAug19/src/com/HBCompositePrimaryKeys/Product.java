package com.HBCompositePrimaryKeys;

import java.io.Serializable;

public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer productId;
	private String productNane;
	private Double price;
	
	

	public Integer getProductId() {
		return productId;
	}



	public void setProductId(Integer productId) {
		this.productId = productId;
	}



	public String getProductNane() {
		return productNane;
	}



	public void setProductNane(String productNane) {
		this.productNane = productNane;
	}



	public Double getPrice() {
		return price;
	}



	public void setPrice(Double price) {
		this.price = price;
	}



	public Product() {
		// TODO Auto-generated constructor stub
	}

}
