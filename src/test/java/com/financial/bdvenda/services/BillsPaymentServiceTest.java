package com.financial.bdvenda.services;

import static com.financial.bdvenda.helpers.ConstantsHelperMock.PAYMENT_DATE;
import static com.financial.bdvenda.helpers.ConstantsHelperMock.PAYMENT_VALUE;
import static com.financial.bdvenda.helpers.MockHelper.mockBillsPaymentWithStatusFalse;
import static com.financial.bdvenda.helpers.MockHelper.mockBillsPaymentWithStatusTrue;
import static org.mockito.Mockito.when;

import com.financial.bdvenda.domains.BillsPayment;
import com.financial.bdvenda.domains.FinancialRelease;
import com.financial.bdvenda.helpers.ReleaseHelper;
import com.financial.bdvenda.repository.BillsPaymentRepository;
import com.financial.bdvenda.service.BillsPaymentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BillsPaymentServiceTest {

  @InjectMocks BillsPaymentService paymentService;
  @Mock
  BillsPaymentRepository paymentRepository;
  @Mock ReleaseHelper releaseHelper;

  @Test
  public void saveBillsPaymentWithStatusTrue() {

    BillsPayment billsPayment = mockBillsPaymentWithStatusTrue();

    when(releaseHelper.calculationOfPaymentValue(PAYMENT_VALUE, PAYMENT_DATE))
        .thenReturn(new FinancialRelease());
    paymentService.saveBillsPayment(billsPayment);
    Mockito.verify(paymentRepository, Mockito.times(1)).save(billsPayment);
  }

  @Test
  public void saveBillsPaymentWithStatusFalse() {

    BillsPayment billsPayment = mockBillsPaymentWithStatusFalse();

    when(releaseHelper.calculationOfUnpaidValue(PAYMENT_VALUE, PAYMENT_DATE))
        .thenReturn(new FinancialRelease());
    paymentService.saveBillsPayment(billsPayment);
    Mockito.verify(paymentRepository, Mockito.times(1)).save(billsPayment);
  }
}
