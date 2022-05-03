package com.example.adminservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.adminservice.dao.CustomersDao;
import com.example.adminservice.model.Branchinfo;
import com.example.adminservice.model.Customers;

@Service
public class CustomerServiceImpl implements CustomersService {

	@Autowired 
	CustomersDao dao;
	
	@Override
	public List<Customers> getAllCustomers() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Customers insertCustomer(Customers customer) {
		// TODO Auto-generated method stub
		return dao.save(customer);
	}

	@Override
	public String deleteCustomer(Customers customer) {
		// TODO Auto-generated method stub
		dao.delete(customer);
		return "Delete is done";
	}
	

}
