package com.example.financas.demo.service;

import com.example.financas.demo.domains.BillsPayment;
import com.example.financas.demo.domains.FinancialRelease;
import com.example.financas.demo.helpers.ReleaseHelper;
import com.example.financas.demo.repository.BillsPaymentRepository;
import com.example.financas.demo.repository.FinancialReleaseRepository;
import java.math.BigDecimal;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillsPaymentService {

  private BillsPaymentRepository billsPaymentRepository;
  private ReleaseHelper releaseHelper;
  private FinancialReleaseRepository releaseRepository;

  @Autowired
  public BillsPaymentService(
      BillsPaymentRepository billsPaymentRepository,
      ReleaseHelper releaseHelper,
      FinancialReleaseRepository releaseRepository) {
    this.billsPaymentRepository = billsPaymentRepository;
    this.releaseHelper = releaseHelper;
    this.releaseRepository = releaseRepository;
  }

  public Iterable<BillsPayment> listBillsPayment() {
    return billsPaymentRepository.findAll();
  }

  public Optional<BillsPayment> onlyBillsPayment(Long id) {
    return billsPaymentRepository.findById(id);
  }

  public BillsPayment saveBillsPayment(BillsPayment billsPayment) {

    if (billsPayment.isStatus()) {
      releaseHelper.calculationOfPaymentValue(
          billsPayment.getPaymentAmount(), billsPayment.getPaymentDate());
    } else {
      releaseHelper.calculationOfUnpaidValue(
          billsPayment.getPaymentAmount(), billsPayment.getPaymentDate());
    }
    return billsPaymentRepository.save(billsPayment);
  }

  public BillsPayment updateBillsPayment(BillsPayment billsPayment) {

    try {
      if (billsPayment.getId() != null) {
        FinancialRelease financialRelease = releaseRepository.getById(billsPayment.getId());
        if (billsPayment.isStatus()) {
          financialRelease.setUnpaidBills(BigDecimal.ZERO);
          financialRelease.setPaymentValue(billsPayment.getPaymentAmount());
        } else {
          financialRelease.setPaymentValue(BigDecimal.ZERO);
          financialRelease.setUnpaidBills(billsPayment.getPaymentAmount());
        }
        releaseRepository.save(financialRelease);
        return billsPaymentRepository.save(billsPayment);
      }
      return billsPaymentRepository.save(billsPayment);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    return null;
  }
}
