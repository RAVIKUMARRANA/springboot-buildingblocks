package com.ravirana.Springbootbuildingblock.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ravirana.Springbootbuildingblock.Hello.DTO.UserDetails;

@RestController
public class HelloWorldController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello World";
	}
	
	@GetMapping("/hello-bean")
	public UserDetails helloBean() {
		return new UserDetails("Ravi","Rana","Hazaribagh");
	}
	
	
}
