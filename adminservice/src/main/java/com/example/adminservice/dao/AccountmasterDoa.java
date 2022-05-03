package com.example.adminservice.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.adminservice.model.Accountmaster;
import com.example.adminservice.model.Branchinfo;

@Repository
@Transactional
public interface AccountmasterDoa extends JpaRepository<Accountmaster,Integer>{

}
