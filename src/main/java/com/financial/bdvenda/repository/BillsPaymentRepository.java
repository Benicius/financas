package com.financial.bdvenda.repository;

import com.financial.bdvenda.domains.BillsPayment;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface BillsPaymentRepository extends JpaRepository<BillsPayment, Long> {}
