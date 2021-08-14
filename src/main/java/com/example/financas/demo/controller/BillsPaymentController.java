package com.example.financas.demo.controller;

import com.example.financas.demo.domains.BillsPayment;
import com.example.financas.demo.service.BillsPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/launch-payment")
public class BillsPaymentController {

    @Autowired
    private BillsPaymentService billsPaymentService;

    @GetMapping("/billspayment")
    public ResponseEntity<Iterable<BillsPayment>> getAllBillsPayment(){
        return new ResponseEntity<>(billsPaymentService.listBillsPayment(), HttpStatus.OK);
    }

    @GetMapping("/billspayment/{id}")
    public ResponseEntity<Optional<BillsPayment>> getOnlyBillsPayment(
            @PathVariable(value = "id") Long id){
        return new ResponseEntity<>(billsPaymentService.onlyBillsPayment(id), HttpStatus.OK);
    }

    @PostMapping("/billspayment")
    public ResponseEntity<BillsPayment> saveBillsPayment(
            @RequestBody BillsPayment billsPayment){
        return new ResponseEntity<>(billsPaymentService.saveBillsPayment(billsPayment), HttpStatus.CREATED);
    }

    @PutMapping("/billspayment")
    public ResponseEntity<BillsPayment> updateBillsPayment(
            @RequestBody BillsPayment billsPayment){
        return new ResponseEntity<>(billsPaymentService.updateBillsPayment(billsPayment), HttpStatus.OK);
    }
}
