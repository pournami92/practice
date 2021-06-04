package com.ust.pms.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ust.pms.model.Product;
//@Service

public class ProductService2 {

	private List<Product> products = new ArrayList<> (Arrays.asList(
					new Product(1, "Mouse", 100,399),
					new Product(2, "Laptop", 1507,299),
					new Product(3, "Pendrive", 1002,1992)

					
			)		
				
			);
	public List<Product> getProducts(){
		return products;
	}
	
	public Product getProduct(Integer productId) {
		return products.stream().filter(t->t.getProductId() == (productId)).findFirst().get();
		
	}
	public void saveProduct(Product product) {
		products.add(product);
	}
	
	public void deleteProduct(Integer productId) {
		 products.removeIf(t->t.getProductId() == productId);
	}
	public void updateProduct(Product product) {
		for(int i=0;i<products.size();i++) {
			Product p = products.get(i);
			if(p.getProductId() == product.getProductId()) {
				products.set(i, product);
				return;
			}
		}
	}
			
}
