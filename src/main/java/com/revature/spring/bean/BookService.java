package com.revature.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookService {

    @Autowired
    PaymentService paymentService;
    
    @Autowired
    InvoiceService invoiceService;
    
    public void processBook() {
        System.out.println("Processing book...");
        paymentService.processPayment();
        invoiceService.generateInvoice();
    }

}
