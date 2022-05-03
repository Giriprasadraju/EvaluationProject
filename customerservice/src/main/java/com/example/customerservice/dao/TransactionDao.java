package com.example.customerservice.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.customerservice.model.Transactions;

@Repository
@Transactional
public interface TransactionDao extends JpaRepository<Transactions,Integer> {
	@Query("select t from Transactions t where t.transaction_type=?1")
	public List<Transactions> searchByTransactionType(String s);

}
