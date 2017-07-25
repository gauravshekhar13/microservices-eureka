package com.eureka.helloserver.helloclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest/cloud/client")
public class CloudResource {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping
	public String CloudHello(){
		String url = "http://hello-server/rest/cloud/server";
		return restTemplate.getForObject(url, String.class);
	}
}
