package com.example.financas.demo.domains;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
@DiscriminatorColumn(name = "bills_pay")
public class BillsPay extends Account{

    private LocalDateTime paymentDate;

    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDateTime paymentDate) {
        this.paymentDate = paymentDate;
    }
}
