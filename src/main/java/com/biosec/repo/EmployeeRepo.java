package com.biosec.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.biosec.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
	
	List<Employee> findByIsarchived(boolean isArchived);
	
	 @Query("select c from Employee c where lower(c.name) like lower(concat('%', ?1, '%')) ")
	  List<Employee> search(String stringFilter);

}
