package com.example.financas.demo.domains;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
@DiscriminatorColumn(name = "bills_pay")
public class BillsPay extends Account{

    private LocalDateTime payDay;

    public LocalDateTime getPayDay() {
        return payDay;
    }

    public void setPayDay(LocalDateTime payDay) {
        this.payDay = payDay;
    }
}
