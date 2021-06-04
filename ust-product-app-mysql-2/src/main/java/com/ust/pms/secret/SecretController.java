package com.ust.pms.secret;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecretController {

	@GetMapping("/secret")
	public String topSecret() {
		return "It is a top secret controller and no one should know about this";
	}
}
