package com.financial.bdvenda.domains;

public enum Installments {
  ONE,
  TWO,
  THREE,
  FOUR,
  FIVE,
  SIX,
  SEVEN,
  EIGHT,
  NINE,
  TEN;

  public String getStatus() {
    return this.name();
  }
}
