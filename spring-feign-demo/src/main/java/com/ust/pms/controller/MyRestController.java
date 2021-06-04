package com.ust.pms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ust.pms.client.ProductClient;
import com.ust.pms.model.Product;

@RestController
public class MyRestController {
	
	@Autowired
	private ProductClient productClient;
	
	@GetMapping("/productData/{id}")
	
	public ResponseEntity<Product> getProducts(@PathVariable("productId") Integer productId) {
		return new ResponseEntity<Product>(productClient.getProductById(productId),HttpStatus.OK);
	}
	@PutMapping
	public ResponseEntity<Product> updateProduct(@RequestBody Product product) {
		return new ResponseEntity<Product>(productClient.updateProduct(product),HttpStatus.CREATED);
	}
	
}
