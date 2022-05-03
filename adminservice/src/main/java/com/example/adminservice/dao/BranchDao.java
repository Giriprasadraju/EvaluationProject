package com.example.adminservice.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.adminservice.model.Branchinfo;
import com.example.adminservice.model.Customers;

@Repository
@Transactional
public interface BranchDao extends JpaRepository<Branchinfo,Integer> {

}
