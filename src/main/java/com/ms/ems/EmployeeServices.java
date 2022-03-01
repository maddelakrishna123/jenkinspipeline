package com.ms.ems;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.ems.exceptions.EmployeeNotFoundException;
import com.ms.ems.model.Employee;

@Service
public class EmployeeServices {
	@Autowired
	private EmployeeRepository repository ;
	
	public List<Employee> employees()
	{
		return repository.findAll();
	}

	public Employee createNewEmployee(Employee employee)
	{
		return repository.save(employee);
	}
	
	public Employee updateEmployee(Employee employee)
	{
		
		System.out.println("id"+employee.getId());
		
        Optional<Employee> empOptional = repository.findById(employee.getId());
		
        System.out.println(empOptional.get());
		if(empOptional.isPresent())
		{
			repository.save(empOptional.get());
		}
		else
		{
			throw new EmployeeNotFoundException("Employee Not Found");
		}
		
		
		
	return	repository.save(employee);
	}
	
	public String deleteEmployee(int id)
	{
		Optional<Employee> empOptional = repository.findById(id);
		
		if(empOptional.isPresent())
		{
			repository.save(empOptional.get());
		}
		
		return "Employee Deleted";
	}
	
	public Employee getEmployee(int id) {
		Optional<Employee> empOptional = repository.findById(id);
		
		if(empOptional.isPresent())
		{
		return 	empOptional.get();
		}else 
		{
			throw new EmployeeNotFoundException("Employee Not Found");
		}
	}
}
