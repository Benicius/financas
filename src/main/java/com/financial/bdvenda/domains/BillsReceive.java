package com.financial.bdvenda.domains;

import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;


@Document(collation = "billsReceive")
public class BillsReceive extends Account {

  private LocalDate deliveryDate;

  public LocalDate getDeliveryDate() {
    return deliveryDate;
  }

  public void setDeliveryDate(LocalDate deliveryDate) {
    this.deliveryDate = deliveryDate;
  }
}
