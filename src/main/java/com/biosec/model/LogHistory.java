package com.biosec.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import static javax.persistence.TemporalType.TIMESTAMP;

import java.util.Date;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.biosec.util.Action;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class LogHistory {

    

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "emp_id")
    private Employee employee;

    private String operationDetail;

    @CreatedBy
    private String modifiedBy;

    @CreatedDate
    @Temporal(TIMESTAMP)
    private Date modifiedDate;

    @Enumerated
    private Action action;
    
    
    

    public LogHistory() {
    }

    public LogHistory(Employee employee, Action action) {
        this.employee = employee;
        this.action = action;
        this.operationDetail= action.name();
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}



	public String getOperationDetail() {
		return operationDetail;
	}

	public void setOperationDetail(String operationDetail) {
		this.operationDetail = operationDetail;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public Action getAction() {
		return action;
	}

	public void setAction(Action action) {
		this.action = action;
	}

	
	
    
    
}
