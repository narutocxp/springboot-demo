package com.rongji.springboot.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {

	@RequestMapping("/register")
	public String login() throws Exception{
		return "Nice to meet you ";
	}
	
}
