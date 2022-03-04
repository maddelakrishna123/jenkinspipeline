package com.ms.ems.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ms.ems.EmployeeServices;
import com.ms.ems.model.Employee;

import lombok.extern.slf4j.Slf4j;

@RestController
@CrossOrigin(origins = {"http://localhost:3000"})
@RequestMapping("/employees")
@Slf4j

public class EmployeeController {
	@Autowired
  private EmployeeServices service;
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Employee> getEmployees()
	{
		log.info("Inside get emploeye");
		return service.employees();
	}
	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Employee getEmployee(@PathVariable int id)
	{
		log.info("Entered into getEmployee");
		return service.getEmployee(id);
	}
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Employee createEmp(@RequestBody Employee employee) {
		log.info("Entered into create employee");
		return service.createNewEmployee(employee);
	}
	@PutMapping
	@ResponseStatus(HttpStatus.OK)
	
	public Employee updateEmp(@RequestBody Employee employee) {
		
		System.out.println("Inside update");
		log.info(employee.getId()+" id");
		return service.updateEmployee(employee);
	}
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public String deleteEmployee(@PathVariable int id)
	{
		return service.deleteEmployee(id);
	}
	
}
