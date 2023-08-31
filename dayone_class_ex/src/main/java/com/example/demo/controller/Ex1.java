package com.example.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ex1 {

		@GetMapping("show")
		public String Welcome() {
			return "Welcome String boot!";
		}
	}

