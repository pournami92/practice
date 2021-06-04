package com;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyRestController {
	
	
	
	@Autowired
	private HelloImpl helloImpl;

	@RequestMapping("/getData")
	public String getData() {
		return helloImpl.getData();
	}
	
	@RequestMapping("/getAccounts")
	public ResponseEntity<String> getAccounts() {
		return helloImpl.getAccounts();
		
	}

	
}
