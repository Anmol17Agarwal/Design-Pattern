package FactoryDesignPattern.payment_service;

public class UpiPaymentProcessor implements PaymentProcessor {
    @Override
    public PaymentResponse pay(PaymentRequest request) {
        System.out.println("Processing UPI payment via: " + request.getUpiId() + " of amount "+request.getAmount());
        return new PaymentResponse(true, "UPI Payment Success");
    }
}

