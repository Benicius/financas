package com.example.financas.demo.helpers;

import com.example.financas.demo.domains.BillsPayment;
import com.example.financas.demo.domains.FinancialRelease;
import com.example.financas.demo.domains.FormPayment;
import java.math.BigDecimal;
import java.time.LocalDate;

public final class MockHelper {

  private MockHelper() {}

  public static BillsPayment mockBillsPayment() {
    BillsPayment billsPayment = new BillsPayment();
    billsPayment.setStatus(true);
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
