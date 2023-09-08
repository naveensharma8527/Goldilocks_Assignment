package com.goldilocks.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goldilocks.entity.Employee;
import com.goldilocks.exception.EmployeeNotFoundException;
import com.goldilocks.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepo employeeRepo;
	
	public List<Employee> getAllEmployee() throws EmployeeNotFoundException{
		List<Employee> employees = employeeRepo.findAll();
		
		if(employees.isEmpty()) {
			throw new EmployeeNotFoundException("NO Employee in Database");
		}
		
		return employees;
	}
	
}
