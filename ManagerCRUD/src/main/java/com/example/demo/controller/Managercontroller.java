package com.example.demo.controller;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

@Repository
public class Managercontroller {

	@GetMapping
	public String home() {
		return "Hello World";
	}
}
