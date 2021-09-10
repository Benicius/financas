package com.financial.bdvenda.helpers;

import com.financial.bdvenda.domains.FinancialRelease;
import com.financial.bdvenda.repository.RealeaseRepository;
import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReleaseHelper {

  @Autowired private RealeaseRepository realeaseRepository;

  public FinancialRelease calculationOfPaymentValue(
      BigDecimal paymentValue, LocalDate paymentDate) {
    FinancialRelease release = new FinancialRelease();
    release.setPaymentValue(paymentValue);
    release.setPaymentDate(paymentDate);
    return realeaseRepository.save(release);
  }

  public FinancialRelease calculationOfUnpaidValue(BigDecimal unpaidValue, LocalDate paymentDate) {
    FinancialRelease release = new FinancialRelease();
    release.setUnpaidBills(unpaidValue);
    release.setPaymentDate(paymentDate);
    return realeaseRepository.save(release);
  }

  public FinancialRelease calculationOfReceiveValue(
      BigDecimal receiveValue, LocalDate receiveDate) {
    FinancialRelease release = new FinancialRelease();
    release.setReceiveValue(receiveValue);
    release.setReceiveDate(receiveDate);
    return realeaseRepository.save(release);
  }

  public FinancialRelease calculationOfUnreceivedValue(
      BigDecimal unreceived, LocalDate receiveDate) {
    FinancialRelease release = new FinancialRelease();
    release.setUnreceivedBills(unreceived);
    release.setReceiveDate(receiveDate);
    return realeaseRepository.save(release);
  }
}
