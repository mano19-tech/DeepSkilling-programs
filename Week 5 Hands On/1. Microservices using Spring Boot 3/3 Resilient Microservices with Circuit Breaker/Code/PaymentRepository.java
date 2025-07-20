package com.example.paymentservice.payment.repository;

import com.example.paymentservice.payment.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
