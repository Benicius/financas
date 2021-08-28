package com.example.financas.demo.repository;

import com.example.financas.demo.domains.BillsPayment;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface BillsPaymentRepository extends JpaRepository<BillsPayment, Long> {}
