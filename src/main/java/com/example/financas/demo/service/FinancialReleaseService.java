package com.example.financas.demo.service;

import com.example.financas.demo.domains.FinancialRelease;
import com.example.financas.demo.repository.FinancialReleaseRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FinancialReleaseService {

  @Autowired private FinancialReleaseRepository financialReleaseRepository;

  public List<FinancialRelease> getAllFinancialRelease() {
    return financialReleaseRepository.findAll();
  }

  public FinancialRelease findSumReleaseFinancial() {
    return financialReleaseRepository.findBySumReleaseFinancial();
  }
}
