package com.financial.bdvenda.repository;

import com.financial.bdvenda.domains.BillsReceive;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillsReceiveRepository extends MongoRepository<BillsReceive, String> {}
