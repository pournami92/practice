package com.pms.ust.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	@RequestMapping("/pp")
	public String file() {
		return "file";
	}
	@RequestMapping("/aa")
	public String save() {
		
		return "new";
	}
}
