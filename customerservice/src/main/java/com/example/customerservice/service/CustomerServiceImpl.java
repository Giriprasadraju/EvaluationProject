package com.example.customerservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.customerservice.dao.CustomerinfoDao;
import com.example.customerservice.model.Customerinfo;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerinfoDao dao;
	
	@Override
	public List<Customerinfo> getCustomerData() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
