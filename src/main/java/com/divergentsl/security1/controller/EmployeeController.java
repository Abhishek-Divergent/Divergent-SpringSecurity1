package com.divergentsl.security1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.divergentsl.security1.entity.Employee;
import com.divergentsl.security1.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;

	@GetMapping("/hello")
	public String hello() {
		return "user";

	}

	@PostMapping("/create")
	@ResponseStatus(HttpStatus.CREATED)
	public void createEmployee(@RequestBody Employee employee) {
		System.out.println(employee);
		employeeService.setAllData(employee);
	}

}