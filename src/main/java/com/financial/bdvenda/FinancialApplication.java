package com.financial.bdvenda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
public class FinancialApplication {

  public static void main(String[] args) {
    SpringApplication.run(FinancialApplication.class, args);
  }
}
