package FactoryDesignPattern.payment_service;

public class WalletPaymentProcessor implements PaymentProcessor {
    @Override
    public PaymentResponse pay(PaymentRequest request) {
        System.out.println("Processing WALLET payment from: " + request.getWalletId() + " of amount " + request.getAmount());
        return new PaymentResponse(true, "Wallet Payment Success");
    }
}
