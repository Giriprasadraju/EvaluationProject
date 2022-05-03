package com.example.customerservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.customerservice.dao.TransactionDao;
import com.example.customerservice.model.Transactions;

@Service
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	TransactionDao dao;
	
	@Override
	public List<Transactions> searchByTransactionType(String s) {
		// TODO Auto-generated method stub
		return dao.searchByTransactionType(s);
	}

}
