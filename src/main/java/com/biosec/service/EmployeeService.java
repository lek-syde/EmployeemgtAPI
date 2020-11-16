package com.biosec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biosec.model.Employee;
import com.biosec.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepo employeeRepo;
	
	
	
	public void saveEmployee(Employee employee) {
		employeeRepo.save(employee);
		
		
	}
	
	
	
	
	public List<Employee> showAllEmployees() {
		return employeeRepo.findAll();
		
		
	}
	
	public List<Employee> showArchivedEmployees() {
		return employeeRepo.findByIsarchived(true);
		
		
	}
	
	public List<Employee> showcurrentEmployees() {
		return employeeRepo.findByIsarchived(false);
		
		
	}




	public List<Employee> searchEmployee(String keyword) {
		// TODO Auto-generated method stub
		return employeeRepo.search(keyword);
	}




	
	
	
	

}
