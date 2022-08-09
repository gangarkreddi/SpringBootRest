package com.prajwal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/testService")
public class TestService {
	
	@GetMapping
	public String getDemoService() {
		return "Demo Service";
	}

}
