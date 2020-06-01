package com.movie.app.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Customer {

	
	  @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	  @Column(name="Customer_id")
	private int cid;
	
	  @Column(name="First_Nmae")
	private String firstName;
	@Column(name="Last_Name")
	private String LastName;
	
	
	
	

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	
	
	
	
	
	
	
	
}

