package com.example.financas.demo.service;

import com.example.financas.demo.domains.BillsPayment;
import com.example.financas.demo.helpers.ReleaseHelper;
import com.example.financas.demo.repository.BillsPaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BillsPaymentService {

    @Autowired
    private BillsPaymentRepository billsPaymentRepository;
    @Autowired
    private ReleaseHelper releaseHelper;

    public Iterable<BillsPayment> listBillsPayment(){
        return billsPaymentRepository.findAll();
    }

    public Optional<BillsPayment> onlyBillsPayment(Long id){
        return billsPaymentRepository.findById(id);
    }

    public BillsPayment saveBillsPayment(BillsPayment billsPayment){

        if(billsPayment.isStatus()){
            releaseHelper.calculationOfPaymentValue(billsPayment.getPaymentAmount(), billsPayment.getPaymentDate());
        } else {
            releaseHelper.calculationOfUnpaidValue(billsPayment.getPaymentAmount(), billsPayment.getPaymentDate());
        }
        return billsPaymentRepository.save(billsPayment);
    }

    public BillsPayment updateBillsPayment(BillsPayment billsPayment){
        return billsPaymentRepository.save(billsPayment);
    }

}
