package com.financial.bdvenda.repository;

import com.financial.bdvenda.domains.FinancialRelease;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RealeaseRepository extends MongoRepository<FinancialRelease, String> {}
