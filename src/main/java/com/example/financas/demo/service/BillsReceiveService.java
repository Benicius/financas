package com.example.financas.demo.service;

import com.example.financas.demo.domains.BillsReceive;
import com.example.financas.demo.repository.BillsReceiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BillsReceiveService {

    @Autowired
    private BillsReceiveRepository billsReceiveRepository;

    public Iterable<BillsReceive> allBillsReceive(){
        return billsReceiveRepository.findAll();
    }

    public Optional<BillsReceive> onlyBillsReceive(Long id){
        return billsReceiveRepository.findById(id);
    }

    public BillsReceive saveBillsReceive(BillsReceive billsReceive){
        return billsReceiveRepository.save(billsReceive);
    }

    public BillsReceive updateBillsReceive(BillsReceive billsReceive){
        return billsReceiveRepository.save(billsReceive);
    }
}
