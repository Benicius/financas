package com.example.financas.demo.services;

import static com.example.financas.demo.helpers.ConstantsHelperMock.PAYMENT_DATE;
import static com.example.financas.demo.helpers.ConstantsHelperMock.PAYMENT_VALUE;
import static com.example.financas.demo.helpers.MockHelper.mockBillsPayment;
import static org.mockito.Mockito.when;

import com.example.financas.demo.domains.BillsPayment;
import com.example.financas.demo.domains.FinancialRelease;
import com.example.financas.demo.helpers.ReleaseHelper;
import com.example.financas.demo.repository.BillsPaymentRepository;
import com.example.financas.demo.service.BillsPaymentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BillsPaymentServiceTest {

  @InjectMocks BillsPaymentService paymentService;
  @Mock BillsPaymentRepository paymentRepository;
  @Mock ReleaseHelper releaseHelper;

  @Test
  public void saveBillsPayment() {

    BillsPayment billsPayment = mockBillsPayment();

    when(releaseHelper.calculationOfPaymentValue(PAYMENT_VALUE, PAYMENT_DATE))
        .thenReturn(new FinancialRelease());
    paymentService.saveBillsPayment(billsPayment);
    Mockito.verify(paymentRepository, Mockito.times(1)).save(billsPayment);
  }
}
