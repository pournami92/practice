package com.ust.pms.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.pms.model.Product;
import com.ust.pms.service.ProductService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("product")
@CrossOrigin(origins = { "https://editor.swagger.io"})
public class ProductController {
	@Autowired
	ProductService productService;
	
	//@RequestMapping(method = RequestMethod.POST,value="/product")
	@PostMapping
	public String saveProduct(@RequestBody Product product) {
		System.out.println("Saving product received:" +product);
		productService.saveProduct(product);
		return "saving Product";
	}
	
	//@RequestMapping(method = RequestMethod.DELETE,value="/product")
	@DeleteMapping("/{productId}")
	public String deleteProduct(@PathVariable("productId") Integer productId) {
		productService.deleteProduct(productId);
		return "deleting Product";
	}
	//@RequestMapping(method = RequestMethod.PUT,value="/product")
	@PutMapping
	@ApiOperation(value = "update a product",notes = "show the product details to update a particular product", response=Product.class)
	public String updateProduct(@RequestBody Product product) {
		productService.updateProduct(product);
		return "Update Product";
	}
	
	//@RequestMapping(method = RequestMethod.GET,value="/product")
	@GetMapping
	@ApiOperation(value = "product by product details",notes = "Get product details", response=Product.class)
	public List<Product> getProducts(){
		System.out.println("Get Products");
		return productService.getProducts();			
	}
	
	
	@GetMapping(path = "/{productId}")
	@ApiOperation(value = "find product by product id",notes = "Give product id to search for a particular id", response=Product.class)
	public Product getProduct(
			@PathVariable("productId") Integer productId)
	
	{
		System.out.println("Get Product for product id" +productId);

		return productService.getProduct(productId);			
				

	}
}


