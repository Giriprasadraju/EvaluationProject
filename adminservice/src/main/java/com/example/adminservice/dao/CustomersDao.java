package com.example.adminservice.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.adminservice.model.Customers;

@Repository
@Transactional
public interface CustomersDao extends JpaRepository<Customers,Integer>{

	
}
