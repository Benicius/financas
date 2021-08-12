package com.example.financas.demo.controller;

import com.example.financas.demo.domains.BillsPay;
import com.example.financas.demo.service.BillsPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/launch-pay")
public class BillsPayController {

    @Autowired
    private BillsPayService billsPayService;

    @GetMapping("/billspay")
    public ResponseEntity<Iterable<BillsPay>> getAllBillsPay(){
        return new ResponseEntity<>(billsPayService.listBillsPay(), HttpStatus.OK);
    }

    @GetMapping("/billspay/{id}")
    public ResponseEntity<Optional<BillsPay>> getOnlyBillsPay(
            @PathVariable(value = "id") Long id){
        return new ResponseEntity<>(billsPayService.onlyBillsPay(id), HttpStatus.OK);
    }

    @PostMapping("/billspay")
    public ResponseEntity<BillsPay> saveBillsPay(
            @RequestBody BillsPay billsPay){
        return new ResponseEntity<>(billsPayService.saveBillsPay(billsPay), HttpStatus.CREATED);
    }

    @PutMapping("/billspay")
    public ResponseEntity<BillsPay> updateBillsPay(
            @RequestBody BillsPay billsPay){
        return new ResponseEntity<>(billsPayService.updateBillsPay(billsPay), HttpStatus.OK);
    }
}
