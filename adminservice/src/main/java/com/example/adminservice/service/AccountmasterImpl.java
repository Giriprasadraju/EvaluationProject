package com.example.adminservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.adminservice.dao.AccountmasterDoa;
import com.example.adminservice.model.Accountmaster;

@Service
public class AccountmasterImpl implements Accountmasterinfo {
	
	@Autowired
	AccountmasterDoa accountdao;

	@Override
	public Accountmaster insertAccount(Accountmaster accountmaster) {
		// TODO Auto-generated method stub
		return accountdao.save(accountmaster);
	}

}
