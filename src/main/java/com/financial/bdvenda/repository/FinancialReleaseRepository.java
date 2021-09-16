package com.financial.bdvenda.repository;

import com.financial.bdvenda.domains.FinancialRelease;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FinancialReleaseRepository extends MongoRepository<FinancialRelease, String> {

  @Query(
      "SELECT new FinancialRelease(sum(f.paymentValue), sum(f.receiveValue), "
          + "sum(f.unpaidBills), sum(f.unreceivedBills)) "
          + "FROM FinancialRelease f ")
  FinancialRelease findBySumReleaseFinancial();
}
