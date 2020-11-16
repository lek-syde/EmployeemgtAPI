package com.biosec.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biosec.model.LogHistory;
import com.biosec.repo.LogHistoryRepo;

@Service
public class LogService  {
	
	
	@Autowired
	LogHistoryRepo logHistoryRepo;
	
	
	public void saveHistory(LogHistory logHistory) {
		logHistoryRepo.save(logHistory);
		
		
	}
	
	
	public List<LogHistory> showAllLogs() {
		return logHistoryRepo.findAll();
		
		
	}
	
	

}
