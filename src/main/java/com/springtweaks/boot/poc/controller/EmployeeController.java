package com.springtweaks.boot.poc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springtweaks.boot.poc.entity.Employee;
import com.springtweaks.boot.poc.repository.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Employee> findAll(){
		return employeeRepository.findAll();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Employee create(@RequestBody Employee employee) {
		return employeeRepository.save(employee);				
	}
	
	@RequestMapping(value = "/{employeeId}", method = RequestMethod.GET)
	public Employee get(@PathVariable String employeeId) {
		return employeeRepository.findOne(employeeId);
	}

}
