package com;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class UstProductAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(UstProductAppApplication.class, args);
	}
	
	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				//.paths(PathSelectors.ant("/product/*"))
				.apis(RequestHandlerSelectors.basePackage("com.ust.pms.controller"))
				.build()
		        .apiInfo(getApiInfo());
	}
	private ApiInfo getApiInfo() {
		return 
				new ApiInfo("Product App Info","CRUD operations on product","1.0",
				"Licensed under GLU",
				new Contact("Pournami Pillai","http://www.pournami.com","pournami137@gmail.com"),
				"API License","http://www.pournami.com",
					Collections.emptyList());
	}
	

}
