package com.example.customerservice.service;

import java.util.List;

import com.example.customerservice.model.Transactions;

public interface TransactionService {

	public List<Transactions> searchByTransactionType(String s);
}
