package com.biosec.model;


import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.biosec.config.Auditable;
import com.biosec.config.FileEntityListener;
import com.biosec.util.DateHandler;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.Date;

@Entity
@EntityListeners(FileEntityListener.class)
public class Employee extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank (message = "Employee name is mandatory")
    private String name;
    
    @NotBlank (message = "Employee position is mandatory")
    private String position;
    
    @Email (message = "Email invalid")
    private String email;
    
    private long phone;
    
   
    @JsonDeserialize(using = DateHandler.class)
    @JsonFormat(pattern="dd-MM-yyyy")
    @NotNull
    private Date dateHired;
   
    @JsonFormat(pattern="dd-MM-yyyy")
    @JsonDeserialize(using = DateHandler.class)
    @NotNull
    private Date dateOfBirth;
    
    
    private String sex;
    private String address;
    private String city;
    private String state;

    
    
    private boolean isarchived;
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public Date getDateHired() {
        return dateHired;
    }

    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

   

    public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", position=" + position + ", email=" + email + ", phone="
				+ phone + ", dateHired=" + dateHired + ", dateOfBirth=" + dateOfBirth + ", sex=" + sex + ", address="
				+ address + ", city=" + city + ", state=" + state + "]";
	}

	public boolean isIsarchived() {
		return isarchived;
	}

	public void setIsarchived(boolean isarchived) {
		this.isarchived = isarchived;
	}

	
	
    
}
