package com.example.customerservice.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.customerservice.model.Customerinfo;

@Repository
@Transactional
public interface CustomerinfoDao extends JpaRepository<Customerinfo,Integer>{

}
