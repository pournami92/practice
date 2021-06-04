package com.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("customer")
@Component
public class Customer {

	private String id;
	private String name;
	private String address;
	private String billamount;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBillamount() {
		return billamount;
	}
	public void setBillamount(String billamount) {
		this.billamount = billamount;
	}
	
	
}
