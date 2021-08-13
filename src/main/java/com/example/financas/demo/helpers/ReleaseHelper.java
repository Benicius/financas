package com.example.financas.demo.helpers;

import com.example.financas.demo.domains.FinancialRelease;
import com.example.financas.demo.repository.RealeaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Component
public class ReleaseHelper {

    @Autowired
    private RealeaseRepository realeaseRepository;

    public FinancialRelease calculationOfPaymentValue(BigDecimal paymentValue, LocalDateTime paymentDate){
        FinancialRelease release = new FinancialRelease();
        release.setPaymentValue(paymentValue);
        release.setPaymentDate(paymentDate);
        return realeaseRepository.save(release);
    }

    public FinancialRelease calculationOfReceiveValue(BigDecimal receiveValue, LocalDateTime receiveDate){
        FinancialRelease release = new FinancialRelease();
        release.setReceiveValue(receiveValue);
        release.setReceiveDate(receiveDate);
        return realeaseRepository.save(release);
    }
}
