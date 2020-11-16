package com.biosec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.biosec.model.Employee;
import com.biosec.model.LogHistory;
import com.biosec.service.LogService;

@RestController
public class LogController {
	
	@Autowired
	LogService logservice;
	
	

	  @RequestMapping(value = "/logs", method = RequestMethod.GET)
	   public List<LogHistory>  showlogs( ) {
		
		 return logservice.showAllLogs();
		  
		  
		  
		  
		  
		
	  }
	  

}
