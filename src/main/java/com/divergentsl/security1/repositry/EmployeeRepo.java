package com.divergentsl.security1.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.divergentsl.security1.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{
     Employee findByUsername( String username);
}
