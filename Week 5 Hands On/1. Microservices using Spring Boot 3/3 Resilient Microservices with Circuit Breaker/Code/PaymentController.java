package com.example.paymentservice.payment.controller;


import com.example.paymentservice.payment.entity.Payment;
import com.example.paymentservice.payment.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payments")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @PostMapping
    public String makePayment(@RequestBody Payment payment) throws InterruptedException {
        return paymentService.processPayment(payment);
    }
}
