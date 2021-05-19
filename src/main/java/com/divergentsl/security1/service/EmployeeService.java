package com.divergentsl.security1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.divergentsl.security1.entity.Employee;
import com.divergentsl.security1.repositry.EmployeeRepo;

@Service
public class EmployeeService implements UserDetailsService {
   
	
	@Autowired
	EmployeeRepo employeeRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Employee employee = employeeRepo.findByUsername(username);
		UserDetails details = User.withUsername(employee.getUsername()).password(employee.getPassword())
				.authorities("user").build();
		return details;
	}
	

}
