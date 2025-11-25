package FactoryDesignPattern.payment_service;

public class CardPaymentProcessor implements PaymentProcessor {
    @Override
    public PaymentResponse pay(PaymentRequest request) {
        System.out.println("Processing CARD payment using: " + request.getCardNumber() + " of amount " + request.getAmount());
        return new PaymentResponse(true, "Card Payment Success");
    }
}

