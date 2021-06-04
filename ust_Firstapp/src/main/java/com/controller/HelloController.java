package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Project;

@RestController
public class HelloController {
	
	@Value("${company.name}")
	private String companyName;
	
	@Value("${company.location}")
	private String companylocation;
	
	@RequestMapping("/rain")
	public String rain() {
		return "Its raining";
	}
	
	@RequestMapping("/cmp")
	public String cmp() {
		return "Company name is :" +companyName+ "company location is:" +companylocation;
	}
	
	@Autowired
	Project project;
	
	@RequestMapping("/project")
	public String project() {
		return "Project name is :" +project.getName()+ "Project team size is:" +project.getTeamlead() ;
	}
}

