package com.revature.spring.bean;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    public void processPayment() {
        System.out.println("Processing payment...");
    }

}
