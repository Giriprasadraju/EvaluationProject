package com.example.adminservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.adminservice.model.Branchinfo;
import com.example.adminservice.model.Customers;
import com.example.adminservice.service.BranchinfoService;

@RestController
@RequestMapping("/branch")
public class BranchController {
	
	@Autowired
	BranchinfoService branchservice;
	
	@GetMapping("/all")
	public List<Branchinfo> getAll(){
		return branchservice.getBranches();
	}
	
	@PostMapping("/addbranch")
	public ResponseEntity<Branchinfo> addbranch(@RequestBody Branchinfo branch)
	{
		return new ResponseEntity(branchservice.insertBranch(branch),HttpStatus.ACCEPTED);
	}
	

}
