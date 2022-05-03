package com.example.adminservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.adminservice.model.Branchinfo;
import com.example.adminservice.model.Customers;
import com.example.adminservice.service.BranchinfoService;
import com.example.adminservice.service.CustomersService;

@RequestMapping("/customers")
@RestController
public class CustomersController {
	
	@Autowired
	CustomersService service;
	
	
	@GetMapping("/all")
	public List<Customers> getAll(){
		return service.getAllCustomers();
	}
	
	@PostMapping("/addcustomer")
	public ResponseEntity<Customers> addCustomer(@RequestBody Customers customer)
	{
		return new ResponseEntity(service.insertCustomer(customer),HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/deletecustomer")
	public ResponseEntity<String> deleteCustomer(@RequestBody Customers customer)
	{
		return new ResponseEntity(service.deleteCustomer(customer),HttpStatus.OK);
	}
	

}
