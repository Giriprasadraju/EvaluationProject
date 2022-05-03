package com.example.adminservice.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.bind.annotation.RestController;

@Entity
@Table(name="Customers")
public class Customers {
	@Id
	int customer_number;
	
	public Customers()
	{
		
	}
	public Customers(int customer_number, String firstname, String middlename, String lastname, String customer_city,
			int customer_contactno, String occupation, Date date_of_birth) {
		super();
		this.customer_number = customer_number;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.customer_city = customer_city;
		this.customer_contactno = customer_contactno;
		this.occupation = occupation;
		this.date_of_birth = date_of_birth;
	}
	String firstname;
	String middlename;
	String lastname;
	String customer_city;
	int customer_contactno;
	String occupation;
	Date date_of_birth;
	public int getCustomer_number() {
		return customer_number;
	}
	public void setCustomer_number(int customer_number) {
		this.customer_number = customer_number;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getCustomer_city() {
		return customer_city;
	}
	public void setCustomer_city(String customer_city) {
		this.customer_city = customer_city;
	}
	public int getCustomer_contactno() {
		return customer_contactno;
	}
	public void setCustomer_contactno(int customer_contactno) {
		this.customer_contactno = customer_contactno;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public Date getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	
}
