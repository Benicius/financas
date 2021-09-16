package com.financial.bdvenda.domains;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDate;

@Document(collation = "account")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Account {

  @Id
  private String id;

  private String name;
  private LocalDate dueDate;
  private FormPayment formPayment;

  private BigDecimal paymentAmount;

  private Installments installments;

  private boolean status;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDate getDueDate() {
    return dueDate;
  }

  public void setDueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
  }

  public BigDecimal getPaymentAmount() {
    return paymentAmount;
  }

  public void setPaymentAmount(BigDecimal paymentAmount) {
    this.paymentAmount = paymentAmount;
  }

  public boolean isStatus() {
    return status;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }

  public FormPayment getFormPayment() {
    return formPayment;
  }

  public void setFormPayment(FormPayment formPayment) {
    this.formPayment = formPayment;
  }

  public Installments getInstallments() {
    return installments;
  }

  public void setInstallments(Installments installments) {
    this.installments = installments;
  }
}
