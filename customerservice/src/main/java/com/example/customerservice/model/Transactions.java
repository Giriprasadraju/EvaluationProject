package com.example.customerservice.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transactions")
public class Transactions {
	public Transactions()
	{
		
	}
	
	public Transactions(int transaction_number, int account_number, Date date_of_transaction, String mode_of_tranaction,
			String transaction_type, String transaction_amount) {
		super();
		this.transaction_number = transaction_number;
		this.account_number = account_number;
		this.date_of_transaction = date_of_transaction;
		this.mode_of_tranaction = mode_of_tranaction;
		this.transaction_type = transaction_type;
		this.transaction_amount = transaction_amount;
	}
	@Id
	int transaction_number;
	int account_number;
	Date date_of_transaction;
	String mode_of_tranaction;
	String transaction_type;
	String transaction_amount;
	public int getTransaction_number() {
		return transaction_number;
	}
	public void setTransaction_number(int transaction_number) {
		this.transaction_number = transaction_number;
	}
	public int getAccount_number() {
		return account_number;
	}
	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}
	public Date getDate_of_transaction() {
		return date_of_transaction;
	}
	public void setDate_of_transaction(Date date_of_transaction) {
		this.date_of_transaction = date_of_transaction;
	}
	public String getMode_of_tranaction() {
		return mode_of_tranaction;
	}
	public void setMode_of_tranaction(String mode_of_tranaction) {
		this.mode_of_tranaction = mode_of_tranaction;
	}
	public String getTransaction_type() {
		return transaction_type;
	}
	public void setTransaction_type(String transaction_type) {
		transaction_type = transaction_type;
	}
	public String getTransaction_amount() {
		return transaction_amount;
	}
	public void setTransaction_amount(String transaction_amount) {
		this.transaction_amount = transaction_amount;
	}
	
	

}
