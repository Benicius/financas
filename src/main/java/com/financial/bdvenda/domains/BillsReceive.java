package com.financial.bdvenda.domains;

import java.time.LocalDate;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;

@Entity
@DiscriminatorColumn(name = "bills_receive")
public class BillsReceive extends Account {

  private LocalDate deliveryDate;

  public LocalDate getDeliveryDate() {
    return deliveryDate;
  }

  public void setDeliveryDate(LocalDate deliveryDate) {
    this.deliveryDate = deliveryDate;
  }
}
