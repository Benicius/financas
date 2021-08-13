package com.example.financas.demo.service;

import com.example.financas.demo.domains.BillsPay;
import com.example.financas.demo.helpers.ReleaseHelper;
import com.example.financas.demo.repository.BillsPayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BillsPayService {

    @Autowired
    private BillsPayRepository billsPayRepository;
    @Autowired
    private ReleaseHelper releaseHelper;

    public Iterable<BillsPay> listBillsPay(){
        return billsPayRepository.findAll();
    }

    public Optional<BillsPay> onlyBillsPay(Long id){
        return billsPayRepository.findById(id);
    }

    public BillsPay saveBillsPay(BillsPay billsPay){

        if(billsPay.isStatus()){
            releaseHelper.calculationOfPaymentValue(billsPay.getPaymentAmount(), billsPay.getPaymentDate());
        }
        return billsPayRepository.save(billsPay);
    }

    public BillsPay updateBillsPay(BillsPay billsPay){
        return billsPayRepository.save(billsPay);
    }

}
