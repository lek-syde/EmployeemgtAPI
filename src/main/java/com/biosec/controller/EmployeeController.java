package com.biosec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.biosec.model.Employee;
import com.biosec.service.EmployeeService;

@RestController
public class EmployeeController {
	
	
	@Autowired
	EmployeeService employeeservice;
	
	
	  @GetMapping(value = "/hi")
	    public void baseurl() {

	        System.out.println("entered");

	    }
	  
	  
	  @RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
	   public ResponseEntity<?>  createEmployee( @RequestBody Employee employeeform ) {
		  System.out.println(employeeform.toString());
		  
		  employeeservice.saveEmployee(employeeform);
		  
		  
		  return new ResponseEntity<String>("Employee saved successfully",
	                HttpStatus.OK);
		  
		  
		
	  }
	  
	  
	  @RequestMapping(value = "/showArchivedEmployees", method = RequestMethod.GET)
	   public List<Employee>  showArchivedEmployees( ) {
		
		 return employeeservice.showArchivedEmployees();
		  
		  
		  
		  
		  
		
	  }
	  
	  @RequestMapping(value = "/search/{keyword}", method = RequestMethod.GET)
	   public List<Employee>  showArchivedEmployees(@PathVariable("keyword") String keyword ) {
		
		 return employeeservice.searchEmployee(keyword);
		  
		  
		  
		  
		  
		
	  }
	  
	  
	  @RequestMapping(value = "/showCurrentEmployees", method = RequestMethod.GET)
	   public List<Employee>  showCurrentEmployees( ) {
		
		 return employeeservice.showcurrentEmployees();
		  
		  
		  
		  
		  
		
	  }
	  
	  @RequestMapping(value = "/showEmployees", method = RequestMethod.GET)
	   public List<Employee>  showAllEmployees( ) {
		
		 return employeeservice.showAllEmployees();
		  
		  
		  
		  
		  
		
	  }

}
