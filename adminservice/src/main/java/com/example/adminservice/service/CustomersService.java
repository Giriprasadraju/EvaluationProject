package com.example.adminservice.service;

import java.util.List;

import com.example.adminservice.model.Branchinfo;
import com.example.adminservice.model.Customers;

public interface CustomersService {
	public List<Customers> getAllCustomers();
	public Customers insertCustomer(Customers customer);
	public String deleteCustomer(Customers customer);
	

}
