package com.example.financas.demo.domains;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
@DiscriminatorColumn(name = "bills_receive")
public class BillsReceive extends Account{

    private LocalDateTime deliveryDate;

    public LocalDateTime getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDateTime deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
}
