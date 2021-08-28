package com.example.financas.demo.controller;

import com.example.financas.demo.domains.FinancialRelease;
import com.example.financas.demo.service.FinancialReleaseService;
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
