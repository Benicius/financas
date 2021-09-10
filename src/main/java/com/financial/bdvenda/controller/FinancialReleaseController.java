package com.financial.bdvenda.controller;

import com.financial.bdvenda.domains.FinancialRelease;
import com.financial.bdvenda.service.FinancialReleaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class FinancialReleaseController {

  @Autowired private FinancialReleaseService financialReleaseService;

  @GetMapping("financial-release")
  public ResponseEntity<FinancialRelease> getAllFinancialRelease() {
    return new ResponseEntity<>(financialReleaseService.findSumReleaseFinancial(), HttpStatus.OK);
  }
}
