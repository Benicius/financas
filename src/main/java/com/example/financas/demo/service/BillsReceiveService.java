package com.example.financas.demo.service;

import com.example.financas.demo.domains.BillsReceive;
import com.example.financas.demo.domains.FinancialRelease;
import com.example.financas.demo.helpers.ReleaseHelper;
import com.example.financas.demo.repository.BillsReceiveRepository;
import com.example.financas.demo.repository.FinancialReleaseRepository;
import java.math.BigDecimal;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillsReceiveService {

  private BillsReceiveRepository billsReceiveRepository;
  private ReleaseHelper releaseHelper;
  private FinancialReleaseRepository releaseRepository;

  @Autowired
  public BillsReceiveService(
      BillsReceiveRepository billsReceiveRepository,
      ReleaseHelper releaseHelper,
      FinancialReleaseRepository releaseRepository) {
    this.billsReceiveRepository = billsReceiveRepository;
    this.releaseHelper = releaseHelper;
    this.releaseRepository = releaseRepository;
  }

  public Iterable<BillsReceive> allBillsReceive() {
    return billsReceiveRepository.findAll();
  }

  public Optional<BillsReceive> onlyBillsReceive(Long id) {
    return billsReceiveRepository.findById(id);
  }

  public BillsReceive saveBillsReceive(BillsReceive billsReceive) {

    if (billsReceive.isStatus()) {
      releaseHelper.calculationOfReceiveValue(
          billsReceive.getPaymentAmount(), billsReceive.getDeliveryDate());
    } else {
      releaseHelper.calculationOfUnreceivedValue(
          billsReceive.getPaymentAmount(), billsReceive.getDeliveryDate());
    }
    return billsReceiveRepository.save(billsReceive);
  }

  public BillsReceive updateBillsReceive(BillsReceive billsReceive) {

    try {
      if (billsReceive.getId() != null) {
        FinancialRelease financialRelease = releaseRepository.getById(billsReceive.getId());
        if (billsReceive.isStatus()) {
          financialRelease.setUnpaidBills(BigDecimal.ZERO);
          financialRelease.setPaymentValue(billsReceive.getPaymentAmount());
        } else {
          financialRelease.setPaymentValue(BigDecimal.ZERO);
          financialRelease.setUnpaidBills(billsReceive.getPaymentAmount());
        }
        releaseRepository.save(financialRelease);
        return billsReceiveRepository.save(billsReceive);
      }
      return billsReceiveRepository.save(billsReceive);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    return null;
  }
}
