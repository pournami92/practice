package com;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication

public class UstFirstappApplication {
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(UstFirstappApplication.class, args);
		String allBeans[] = ctx.getBeanDefinitionNames();
		Arrays.sort(allBeans);
		for(String s:allBeans) {
			System.out.println(s);
		}
	}


	@RequestMapping("/")
	public String sayHello() {
		return "Hi all, welcome to UST Spring boot Training";
	}

	@RequestMapping("/hello")
	public String justAMethod() {
		return "hi hello";
		
	}
	
	@RequestMapping("/ust")
	public String ust() {
		return "hi UST Global";
		}
	
	@RequestMapping("/ust2")
	public String ust12(){
		return "say ust12";
	}
}
