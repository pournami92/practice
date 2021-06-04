package com.ust.pms.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ust.pms.model.Product;

@FeignClient(name = "product-client" , url="http://localhost:8082/product")
public interface ProductClient {

	@GetMapping("/{productId}")
	Product getProductById(@PathVariable int productId);
	@PutMapping
	Product updateProduct (@RequestBody Product product);
	
}
