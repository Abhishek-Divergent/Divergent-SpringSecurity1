package com.divergentsl.security1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class EmployeeController {

	@GetMapping("/hello")
	public String hello() {
	return "user";
}}