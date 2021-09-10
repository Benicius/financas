package com.financial.bdvenda.service;

import com.financial.bdvenda.domains.FinancialRelease;
import com.financial.bdvenda.repository.FinancialReleaseRepository;
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
