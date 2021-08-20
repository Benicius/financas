package com.example.financas.demo.repository;

import com.example.financas.demo.domains.Account;
import com.example.financas.demo.domains.BillsReceive;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface BillsReceiveRepository extends JpaRepository<BillsReceive, Long> {
}
