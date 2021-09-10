package com.financial.bdvenda.controller;

import com.financial.bdvenda.domains.BillsPayment;
import com.financial.bdvenda.service.BillsPaymentService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/launch-payment")
public class BillsPaymentController {

  @Autowired private BillsPaymentService billsPaymentService;

  @PostMapping("/billspayment")
  public ResponseEntity<BillsPayment> saveBillsPayment(@RequestBody BillsPayment billsPayment) {
    return new ResponseEntity<>(
        billsPaymentService.saveBillsPayment(billsPayment), HttpStatus.CREATED);
  }

  @PutMapping("/billspayment")
  public ResponseEntity<BillsPayment> updateBillsPayment(@RequestBody BillsPayment billsPayment) {
    return new ResponseEntity<>(
        billsPaymentService.updateBillsPayment(billsPayment), HttpStatus.OK);
  }
}
