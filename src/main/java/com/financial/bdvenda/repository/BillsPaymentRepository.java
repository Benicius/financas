package com.financial.bdvenda.repository;

import com.financial.bdvenda.domains.BillsPayment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillsPaymentRepository extends MongoRepository<BillsPayment, String> {}
