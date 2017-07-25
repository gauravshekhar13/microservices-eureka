package com.eureka.helloserver.helloserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/cloud/server")
public class CloudResource {
	
	@GetMapping
	public String helloServer(){
		
		return "Microservices using Netflix Eureka ";
	}

}
