package com.example.adminservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.adminservice.model.Accountmaster;
import com.example.adminservice.model.Branchinfo;
import com.example.adminservice.service.Accountmasterinfo;

@RequestMapping("/account")
@RestController
public class AccountController {

		@Autowired
		Accountmasterinfo accountmasterinfo;

		@PostMapping("/addaccount")
		public ResponseEntity<Accountmaster> addaccount(@RequestBody Accountmaster accountmaster)
		{
			return new ResponseEntity((accountmasterinfo.insertAccount(accountmaster)),HttpStatus.ACCEPTED);
		}

	}


