package com.revature.spring.bean;

import org.springframework.stereotype.Component;

@Component
public class InvoiceService {
    public void generateInvoice() {
        System.out.println("Generating invoice...");
    }

}
