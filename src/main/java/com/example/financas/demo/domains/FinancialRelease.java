package com.example.financas.demo.domains;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FinancialRelease implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal paymentValue;
    private BigDecimal unpaidBills;

    private BigDecimal receiveValue;
    private BigDecimal unreceivedBills;

    private LocalDateTime paymentDate;
    private LocalDateTime receiveDate;

    public FinancialRelease(BigDecimal payment, BigDecimal unpaid
        , BigDecimal receive, BigDecimal unreceived) {
        this.paymentValue = payment;
        this.unpaidBills = unpaid;
        this.receiveValue = receive;
        this.unreceivedBills = unreceived;
    }


    public FinancialRelease() {
    }

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

    public BigDecimal getUnpaidBills() {
        return unpaidBills;
    }

    public void setUnpaidBills(BigDecimal unpaidBills) {
        this.unpaidBills = unpaidBills;
    }
}
