package com.financial.bdvenda.domains;

import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collation = "billsPayment")
public class BillsPayment extends Account {

  private LocalDate paymentDate;

  public LocalDate getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(LocalDate paymentDate) {
    this.paymentDate = paymentDate;
  }
}
