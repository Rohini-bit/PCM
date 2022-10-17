package com.example.pcm.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Pet {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Integer Pid;
	String petname;
	String petowner;
	String reason;
	
	public Pet() {
		
	}
	public Pet(Integer pid, String petname, String petowner, String reason) {
		
		Pid = pid;
		this.petname = petname;
		this.petowner = petowner;
		this.reason = reason;
		
	}
	public Pet(String petname, String petowner, String reason, Date date) {
		super();
		this.petname = petname;
		this.petowner = petowner;
		this.reason = reason;
	
	}
	public Integer getPid() {
		return Pid;
	}
	public void setPid(Integer pid) {
		Pid = pid;
	}
	public String getPetname() {
		return petname;
	}
	public void setPetname(String petname) {
		this.petname = petname;
	}
	public String getPetowner() {
		return petowner;
	}
	public void setPetowner(String petowner) {
		this.petowner = petowner;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	@Override
	public String toString() {
		return "Pet [Pid=" + Pid + ", petname=" + petname + ", petowner=" + petowner + ", reason=" + reason + "]";
	}
	
	

}
