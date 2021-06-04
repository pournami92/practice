package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Customer;

@RestController

public class CustomerController {
	@Autowired
	Customer customer;
	
	@RequestMapping("/customer")
	public String customer() {
		return "customer name is :" +customer.getName()+ "customerbillamount is:" +customer.getBillamount() ;
	}
	
	
}
