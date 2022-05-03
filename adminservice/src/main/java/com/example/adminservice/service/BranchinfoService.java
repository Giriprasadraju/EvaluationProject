package com.example.adminservice.service;

import java.util.List;

import com.example.adminservice.model.Branchinfo;

public interface BranchinfoService {
	public Branchinfo insertBranch(Branchinfo branch);
	public List<Branchinfo> getBranches();
	

}
