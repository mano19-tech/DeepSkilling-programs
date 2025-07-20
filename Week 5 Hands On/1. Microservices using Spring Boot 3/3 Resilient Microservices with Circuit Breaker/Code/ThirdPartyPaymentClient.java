package com.example.paymentservice.payment.client;

import org.springframework.stereotype.Service;

@Service
public class ThirdPartyPaymentClient {

    public String callSlowAPI() throws InterruptedException {
        Thread.sleep(3000); // Simulate delay
        return "SUCCESS";
    }
}
