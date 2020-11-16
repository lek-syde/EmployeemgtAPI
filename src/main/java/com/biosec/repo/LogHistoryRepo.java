package com.biosec.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biosec.model.LogHistory;

public interface LogHistoryRepo extends JpaRepository<LogHistory, Integer> {


	List<LogHistory> findAllByOrderByIdDesc();
}
