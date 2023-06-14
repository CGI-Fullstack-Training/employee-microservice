package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeService {
public Employee createemployee(Employee employee);
	
	public List<Employee> findAllEmployees();
}
