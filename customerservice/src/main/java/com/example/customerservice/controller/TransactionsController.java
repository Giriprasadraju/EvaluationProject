package com.example.customerservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.customerservice.model.Transactions;
import com.example.customerservice.service.TransactionService;


@RestController
@RequestMapping("/transactions")
public class TransactionsController {
	
	@Autowired
	TransactionService service;

	@GetMapping("/getmydetails/Ttype/{s}")
	public ResponseEntity<List<Transactions>> getDetailsByTransactiontype(@PathVariable("s") String s)
	{
		return new ResponseEntity(service.searchByTransactionType(s),HttpStatus.OK);
	}
}
