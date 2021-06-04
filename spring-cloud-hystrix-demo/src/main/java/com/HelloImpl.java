package com;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Component
public class HelloImpl {
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private MyBackEndService myBackEndService;

	@HystrixCommand(fallbackMethod = "myfallback1")
public String getData() {
		return myBackEndService.getData();
	}
	@HystrixCommand(fallbackMethod = "myexternalServiceDown")	
public ResponseEntity<String> getAccounts() {
	URI uri = URI.create("http://localhost:9091/getDataFromCloud");
	return restTemplate.getForEntity(uri,String.class);
}
public String myfallback1() {
	return "internal microservice is not available";
}
public ResponseEntity<String> myexternalServiceDown() {
	return new ResponseEntity<String> ("External service is not available either is down or not accessible",HttpStatus.OK);
}
}
