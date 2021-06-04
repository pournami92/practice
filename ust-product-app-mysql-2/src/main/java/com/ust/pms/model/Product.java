package com.ust.pms.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@ApiModel(description = "we have used product model class in our app")
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
	@ApiModelProperty(position = 0,notes = "product id is unique")
	private int productId;
	
	@ApiModelProperty(position = 1,notes = "product name is the name of the product",value = "lakme")
	private String productName;
	
	@ApiModelProperty(position = 2,notes = "stock availability")
	private int quantityonHand;
	
	@ApiModelProperty(position = 3,notes = "cost of the product",value = "100")
	private int price;
	
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
	
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName =" + productName +", quantityonHand=" +quantityonHand 
				+", price=" +price +"]";
	}
}
