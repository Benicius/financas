package com.financial.bdvenda.controller;

import com.financial.bdvenda.domains.BillsReceive;
import com.financial.bdvenda.service.BillsReceiveService;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/launch-receive")
public class BillsReceiveController {

  @Autowired private BillsReceiveService billsReceiveService;

  @GetMapping("/billsreceive")
  public ResponseEntity<Iterable<BillsReceive>> getAllBillsReceive() {
    return new ResponseEntity<>(billsReceiveService.allBillsReceive(), HttpStatus.OK);
  }

  @GetMapping("/billsreceive/{id}")
  public ResponseEntity<Optional<BillsReceive>> getOnlyBillsReceive(
      @PathVariable(value = "id") String id) {
    return new ResponseEntity<>(billsReceiveService.onlyBillsReceive(id), HttpStatus.OK);
  }

  @PostMapping("/billsreceive")
  public ResponseEntity<BillsReceive> saveBillsReceive(@RequestBody BillsReceive billsReceive) {
    return new ResponseEntity<>(
        billsReceiveService.saveBillsReceive(billsReceive), HttpStatus.CREATED);
  }

  /*@PutMapping("/billsreceive")
  public ResponseEntity<BillsReceive> updateBillsReceive(@RequestBody BillsReceive billsReceive) {
    return new ResponseEntity<>(
        billsReceiveService.updateBillsReceive(billsReceive), HttpStatus.CREATED);
  }*/
}
