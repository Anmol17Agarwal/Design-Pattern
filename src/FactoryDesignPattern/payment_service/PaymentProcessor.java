package FactoryDesignPattern.payment_service;

public interface PaymentProcessor {
    PaymentResponse pay(PaymentRequest request);
}

