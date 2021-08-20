package com.example.financas.demo.repository;

import com.example.financas.demo.domains.FinancialRelease;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.List;

@Repository
@Transactional
public interface ReleaseFinancialRepository extends JpaRepository<FinancialRelease, Long> {

  @Query("SELECT sum(f.paymentValue) as payment, sum(f.receiveValue) as receive, " +
      "sum(f.unpaidBills) as unpaid, sum(f.unreceivedBills) as unreceived " +
      "FROM FinancialRelease f ")
  BigDecimal findBySumReleaseFinancial();
}
