package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableDiscoveryClient
@RibbonClient(name= "productserver", configuration = RibbonConfiguration.class)
public class SpringCloudRibbonClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudRibbonClientApplication.class, args);
	}

}
