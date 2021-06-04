package com.ust.pms.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

	public Product() {
		super();
	}
	public Product(int productId, String productName, int quantityonHand, int price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.quantityonHand = quantityonHand;
		this.price = price;
	}
	
	@Id
	private int productId;
	private String productName;
	private int quantityonHand;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantityonHand() {
		return quantityonHand;
	}
	public void setQuantityonHand(int quantityonHand) {
		this.quantityonHand = quantityonHand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	private int price;
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName =" + productName +", quantityonHand=" +quantityonHand 
				+", price=" +price +"]";
	}
}
