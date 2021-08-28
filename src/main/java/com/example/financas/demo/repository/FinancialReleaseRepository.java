package com.example.financas.demo.repository;

import com.example.financas.demo.domains.FinancialRelease;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface FinancialReleaseRepository extends JpaRepository<FinancialRelease, Long> {

  @Query(
      "SELECT new FinancialRelease(sum(f.paymentValue), sum(f.receiveValue), "
          + "sum(f.unpaidBills), sum(f.unreceivedBills)) "
          + "FROM FinancialRelease f ")
  FinancialRelease findBySumReleaseFinancial();
}
