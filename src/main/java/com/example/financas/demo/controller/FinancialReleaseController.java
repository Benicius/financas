package com.example.financas.demo.controller;

import com.example.financas.demo.helpers.FinancialReleaseHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping(value = "/")
public class FinancialReleaseController {

    @Autowired
    private FinancialReleaseHelper releaseHelper;

    @GetMapping("financial-release")
    public ResponseEntity<List<BigDecimal>> getAllFinancialRelease(){

        return new ResponseEntity<>(releaseHelper.getAllFinancialRelease(), HttpStatus.OK);
    }
}