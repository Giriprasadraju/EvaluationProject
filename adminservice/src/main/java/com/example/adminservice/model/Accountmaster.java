package com.example.adminservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="account_master")
public class Accountmaster {
	
	@Id
	int account_number;
	int customer_number;
	int branch_id;
	int opening_balance;
	String account_type;
	String account_status;
	
	public Accountmaster() {
		
	}

	public Accountmaster(int account_number, int customer_number, int branch_id, int opening_balance,
			String account_type, String account_status) {
		super();
		this.account_number = account_number;
		this.customer_number = customer_number;
		this.branch_id = branch_id;
		this.opening_balance = opening_balance;
		this.account_type = account_type;
		this.account_status = account_status;
	}

	public int getAccount_number() {
		return account_number;
	}

	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}

	public int getCustomer_number() {
		return customer_number;
	}

	public void setCustomer_number(int customer_number) {
		this.customer_number = customer_number;
	}

	public int getBranch_id() {
		return branch_id;
	}

	public void setBranch_id(int branch_id) {
		this.branch_id = branch_id;
	}

	public int getOpening_balance() {
		return opening_balance;
	}

	public void setOpening_balance(int opening_balance) {
		this.opening_balance = opening_balance;
	}

	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	public String getAccount_status() {
		return account_status;
	}

	public void setAccount_status(String account_status) {
		this.account_status = account_status;
	}
	

}
