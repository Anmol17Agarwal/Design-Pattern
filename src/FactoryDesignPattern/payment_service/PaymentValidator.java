package FactoryDesignPattern.payment_service;

public class PaymentValidator {

    public static void validate(PaymentRequest req) {

        if (req.getAmount() <= 0) {
            throw new InvalidPaymentException("Amount must be greater than 0");
        }

        switch (req.getType()) {
            case UPI:
                if (req.getUpiId() == null || !req.getUpiId().contains("@")) {
                    throw new InvalidPaymentException("Invalid UPI ID");
                }
                break;

            case CARD:
                if (req.getCardNumber() == null || req.getCardNumber().length() != 16) {
                    throw new InvalidPaymentException("Invalid Card Number");
                }
                break;

            case WALLET:
                if (req.getWalletId() == null) {
                    throw new InvalidPaymentException("Invalid Wallet ID");
                }
                break;
        }
    }
}

