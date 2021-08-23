package com.example.financas.demo.service;

import com.example.financas.demo.domains.FinancialRelease;
import com.example.financas.demo.repository.ReleaseFinancialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class FinancialReleaseService {

    @Autowired
    private ReleaseFinancialRepository releaseFinancialRepository;

    public List<FinancialRelease> getAllFinancialRelease(){
        return releaseFinancialRepository.findAll();
    }

    public FinancialRelease findSumReleaseFinancial(){
        return releaseFinancialRepository.findBySumReleaseFinancial();
    }
}
