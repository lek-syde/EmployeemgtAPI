package com.biosec.config;

import javax.persistence.EntityManager;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.biosec.model.Employee;
import com.biosec.model.LogHistory;
import com.biosec.service.LogService;
import com.biosec.util.Action;
import com.biosec.util.BeanUtil;

public class FileEntityListener {
	
	@Autowired
	LogService logservice;
	
    @PrePersist
    public void prePersist(Employee target) { 
    	 perform(target, Action.INSERTED);
    }

    @PreUpdate
    public void preUpdate(Employee target) { 
    	perform(target, Action.UPDATED);
    }

    @PreRemove
    public void preRemove(Employee target) { 
    	 perform(target, Action.DELETED);
    }
    
    
    @Transactional
    private void perform(Employee target, Action action) {
    	
    	EntityManager entityManager = BeanUtil.getBean(EntityManager.class);
        entityManager.persist(new LogHistory(target, action));
    	
    }
}