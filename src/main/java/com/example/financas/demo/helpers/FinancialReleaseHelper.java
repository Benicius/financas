package com.example.financas.demo.helpers;

import com.example.financas.demo.domains.FinancialRelease;
import com.example.financas.demo.service.FinancialReleaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Component
public class FinancialReleaseHelper {

    @Autowired
    FinancialReleaseService financialReleaseService;

    private List<BigDecimal> financialResponse = new ArrayList<>();

    private BigDecimal sumPaymentValue = BigDecimal.ZERO;
    private BigDecimal sumUnpaidValue = BigDecimal.ZERO;
    private BigDecimal sumReceiveValue = BigDecimal.ZERO;
    private BigDecimal sumUnreceivedValue = BigDecimal.ZERO;

    public List<BigDecimal> getAllFinancialRelease(){

        List<FinancialRelease> releases = financialReleaseService.getAllFinancialRelease();

        for (FinancialRelease release: releases){
            BigDecimal paymentValue = release.getPaymentValue();
            BigDecimal unpaidValue = release.getUnpaidBills();
            BigDecimal receiveValue = release.getReceiveValue();
            BigDecimal unreceivedValue = release.getUnreceivedBills();

            if (paymentValue != null){
                sumPaymentValue = sumPaymentValue.add(paymentValue);
            }
            if (unpaidValue != null){
                sumUnpaidValue = sumUnpaidValue.add(unpaidValue);
            }
            if (receiveValue != null){
                sumReceiveValue = sumReceiveValue.add(receiveValue);
            }
            if (unreceivedValue != null){
                sumUnreceivedValue = sumUnreceivedValue.add(unreceivedValue);
            }
        }
        financialResponse.add(sumPaymentValue);
        financialResponse.add(sumUnpaidValue);
        financialResponse.add(sumReceiveValue);
        financialResponse.add(sumUnreceivedValue);

        return financialResponse;
    }

}
