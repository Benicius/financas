package com.example.financas.demo.domains;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class FinancialRelease implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal paymentValue;
    private BigDecimal totalPaymentValue;

    private BigDecimal receiveValue;
    private BigDecimal totalReceiveValue;

    private LocalDateTime paymentDate;
    private LocalDateTime receiveDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getPaymentValue() {
        return paymentValue;
    }

    public void setPaymentValue(BigDecimal paymentValue) {
        this.paymentValue = paymentValue;
    }

    public BigDecimal getTotalPaymentValue() {
        return totalPaymentValue;
    }

    public void setTotalPaymentValue(BigDecimal totalPaymentValue) {
        this.totalPaymentValue = totalPaymentValue;
    }

    public BigDecimal getReceiveValue() {
        return receiveValue;
    }

    public void setReceiveValue(BigDecimal receiveValue) {
        this.receiveValue = receiveValue;
    }

    public BigDecimal getTotalReceiveValue() {
        return totalReceiveValue;
    }

    public void setTotalReceiveValue(BigDecimal totalReceiveValue) {
        this.totalReceiveValue = totalReceiveValue;
    }

    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDateTime paymentDate) {
        this.paymentDate = paymentDate;
    }

    public LocalDateTime getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(LocalDateTime receiveDate) {
        this.receiveDate = receiveDate;
    }
}
