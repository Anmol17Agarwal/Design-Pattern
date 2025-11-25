package FactoryDesignPattern.payment_service;

public class InvalidPaymentException extends RuntimeException{
    public InvalidPaymentException(String msg) {
        super(msg);
    }
}
