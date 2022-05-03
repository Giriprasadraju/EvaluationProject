package com.example.adminservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.adminservice.dao.BranchDao;
import com.example.adminservice.model.Branchinfo;

@Service
public class BranchinfoServiceImpl implements BranchinfoService {

	@Autowired
	BranchDao branchdao;
	
	@Override
	public Branchinfo insertBranch(Branchinfo branch) {
		// TODO Auto-generated method stub
		return branchdao.save(branch);
	}

	@Override
	public List<Branchinfo> getBranches() {
		// TODO Auto-generated method stub
		return branchdao.findAll();
	}

}
