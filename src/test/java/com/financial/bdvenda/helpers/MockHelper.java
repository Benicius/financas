package com.financial.bdvenda.helpers;

import com.financial.bdvenda.domains.BillsPayment;
import com.financial.bdvenda.domains.FinancialRelease;
import com.financial.bdvenda.domains.FormPayment;
import java.math.BigDecimal;
import java.time.LocalDate;

public final class MockHelper {

  private MockHelper() {}

  public static BillsPayment mockBillsPaymentWithStatusTrue() {
    BillsPayment billsPayment = new BillsPayment();
    billsPayment.setStatus(true);
    billsPayment.setPaymentDate(LocalDate.of(2021, 8, 27));
    billsPayment.setFormPayment(FormPayment.MONEY);
    billsPayment.setPaymentAmount(new BigDecimal(500.25));
    billsPayment.setDueDate(LocalDate.of(2021, 8, 27));
    billsPayment.setName("Luz");

    return billsPayment;
  }

  public static BillsPayment mockBillsPaymentWithStatusFalse() {
    BillsPayment billsPayment = new BillsPayment();
    billsPayment.setStatus(false);
    billsPayment.setPaymentDate(LocalDate.of(2021, 8, 27));
    billsPayment.setFormPayment(FormPayment.MONEY);
    billsPayment.setPaymentAmount(new BigDecimal(500.25));
    billsPayment.setDueDate(LocalDate.of(2021, 8, 27));
    billsPayment.setName("Luz");

    return billsPayment;
  }

  public static FinancialRelease mockFinancialRelease() {
    FinancialRelease financialRelease = new FinancialRelease();
    financialRelease.setPaymentValue(new BigDecimal(500.25));
    financialRelease.setPaymentDate(LocalDate.of(2021, 8, 27));
    return financialRelease;
  }
}
