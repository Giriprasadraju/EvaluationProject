package com.example.customerservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customerinfo")
public class Customerinfo {
	@Id
	int customer_number;
	public Customerinfo()
	{
		
	}
	public Customerinfo(int customer_number, int account_number, String balance) {
		super();
		this.customer_number = customer_number;
		this.account_number = account_number;
		this.balance = balance;
	}
	int account_number;
	String balance;
	public int getCustomer_number() {
		return customer_number;
	}
	public void setCustomer_number(int customer_number) {
		this.customer_number = customer_number;
	}
	public int getAccount_number() {
		return account_number;
	}
	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}

}
