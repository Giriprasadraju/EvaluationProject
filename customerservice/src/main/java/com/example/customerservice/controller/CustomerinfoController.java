package com.example.customerservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.customerservice.model.Customerinfo;
import com.example.customerservice.model.Transactions;
import com.example.customerservice.service.CustomerService;

@RestController
@RequestMapping("/customerinfo")
public class CustomerinfoController {

	@Autowired
	CustomerService service;
	
	@GetMapping("/all")
	public List<Customerinfo> getAll()
	{
		return service.getCustomerData();
	}
	
}
