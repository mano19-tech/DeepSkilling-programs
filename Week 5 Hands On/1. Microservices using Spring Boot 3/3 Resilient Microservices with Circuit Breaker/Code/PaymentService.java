package com.example.paymentservice.payment.service;

import com.example.paymentservice.payment.client.ThirdPartyPaymentClient;
import com.example.paymentservice.payment.entity.Payment;
import com.example.paymentservice.payment.repository.PaymentRepository;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class PaymentService {

    private final ThirdPartyPaymentClient client;
    private final PaymentRepository repository;

    @CircuitBreaker(name = "paymentService", fallbackMethod = "fallbackPayment")
    public String processPayment(Payment payment) throws InterruptedException {
        log.info("Calling third-party API...");
        String response = client.callSlowAPI();
        payment.setStatus(response);
        repository.save(payment);
        return response;
    }

    public String fallbackPayment(Payment payment, Throwable throwable) {
        log.warn("Fallback triggered for payment: {}, reason: {}", payment.getOrderId(), throwable.getMessage());
        payment.setStatus("FAILED_FALLBACK");
        repository.save(payment);
        return "FAILED_FALLBACK";
    }
}
