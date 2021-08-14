package com.example.financas.demo.repository;

import com.example.financas.demo.domains.BillsPayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface BillsPaymentRepository extends JpaRepository<BillsPayment, Long> {

}
