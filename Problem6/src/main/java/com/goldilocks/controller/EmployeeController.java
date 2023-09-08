package com.goldilocks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.goldilocks.entity.Employee;
import com.goldilocks.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
    private EmployeeService employeeService;

    /**
     *  To get All employee
     * @return List of received employees from database
     * @URL http://localhost:8080/employees
     */
    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getAllEmployeeHandler(){
        List<Employee> list = employeeService.getAllEmployee();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
