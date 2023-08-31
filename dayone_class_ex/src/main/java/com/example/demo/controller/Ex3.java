package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ex3 {
	@Value("${color}")
	private String yourfavcolor;
	@GetMapping("display")
	public String getMyFav() 
	{
		return "My favorite color is " + yourfavcolor;
	}
}
