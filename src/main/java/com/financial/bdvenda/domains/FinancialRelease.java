package com.financial.bdvenda.domains;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Document
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FinancialRelease implements Serializable {

  @Id
  private String id;

  private BigDecimal paymentValue;
  private BigDecimal unpaidBills;
  private BigDecimal receiveValue;
  private BigDecimal unreceivedBills;

  private LocalDate paymentDate;
  private LocalDate receiveDate;

  public FinancialRelease(
      BigDecimal payment, BigDecimal unpaid, BigDecimal receive, BigDecimal unreceived) {
    this.paymentValue = payment;
    this.unpaidBills = unpaid;
    this.receiveValue = receive;
    this.unreceivedBills = unreceived;
  }

  public FinancialRelease() {}

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BigDecimal getPaymentValue() {
    return paymentValue;
  }

  public void setPaymentValue(BigDecimal paymentValue) {
    this.paymentValue = paymentValue;
  }

  public BigDecimal getReceiveValue() {
    return receiveValue;
  }

  public void setReceiveValue(BigDecimal receiveValue) {
    this.receiveValue = receiveValue;
  }

  public BigDecimal getUnreceivedBills() {
    return unreceivedBills;
  }

  public void setUnreceivedBills(BigDecimal unreceivedBills) {
    this.unreceivedBills = unreceivedBills;
  }

  public LocalDate getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(LocalDate paymentDate) {
    this.paymentDate = paymentDate;
  }

  public LocalDate getReceiveDate() {
    return receiveDate;
  }

  public void setReceiveDate(LocalDate receiveDate) {
    this.receiveDate = receiveDate;
  }

  public BigDecimal getUnpaidBills() {
    return unpaidBills;
  }

  public void setUnpaidBills(BigDecimal unpaidBills) {
    this.unpaidBills = unpaidBills;
  }
}
