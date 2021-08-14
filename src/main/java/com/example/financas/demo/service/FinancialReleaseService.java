package com.example.financas.demo.service;

import com.example.financas.demo.domains.FinancialRelease;
import com.example.financas.demo.repository.ReleaseFinencialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinancialReleaseService {

    @Autowired
    private ReleaseFinencialRepository releaseFinencialRepository;

    public List<FinancialRelease> getAllFinancialRelease(){
        return releaseFinencialRepository.findAll();
    }
}
