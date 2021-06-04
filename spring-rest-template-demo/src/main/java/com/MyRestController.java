package com;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ust.pms.model.Product;





@RestController
@RequestMapping("/anothermicroserviceproduct")
public class MyRestController {
URI uri = URI.create("http://localhost:9090/getDataFromCloud");
URI producturi = URI.create("http://localhost:8083/product");

@Autowired
private RestTemplate restTemplate;


@GetMapping("/getProduct")
public List<Product> getProduct(){
	ResponseEntity<Product[]> response = restTemplate.getForEntity(producturi, Product[].class);
	return Arrays.asList(response.getBody());
}
@PostMapping
public ResponseEntity<String> createProduct(@RequestBody Product product){
	ResponseEntity<String> response = restTemplate.postForEntity(producturi, product ,String.class);
	return response;
}
@PutMapping
public String updateProduct(@RequestBody Product product){
	 restTemplate.put(producturi, product);
	return "data updated successfully"+product;
}
@DeleteMapping("/{id}")
public String deleteProduct(@PathVariable("id") Integer id){
	String PId = id.toString();	
	restTemplate.delete(producturi+"/"+PId);
	return "data deleted successfully";
}

	
}
