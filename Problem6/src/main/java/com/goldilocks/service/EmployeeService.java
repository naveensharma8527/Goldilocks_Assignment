package com.goldilocks.service;

import java.util.List;

import com.goldilocks.entity.Employee;
import com.goldilocks.exception.EmployeeNotFoundException;

public interface EmployeeService {
	
	public List<Employee> getAllEmployee() throws EmployeeNotFoundException;

}
