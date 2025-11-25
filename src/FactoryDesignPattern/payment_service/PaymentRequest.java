package FactoryDesignPattern.payment_service;

public class PaymentRequest {
    private PaymentType type;
    private double amount;
    private String upiId;
    private String cardNumber;
    private String walletId;

    public PaymentRequest() {
    }

    public PaymentRequest(PaymentType type, double amount, String upiId, String cardNumber, String walletId) {
        this.type = type;
        this.amount = amount;
        this.upiId = upiId;
        this.cardNumber = cardNumber;
        this.walletId = walletId;
    }

    public PaymentType getType() {
        return type;
    }

    public void setType(PaymentType type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getUpiId() {
        return upiId;
    }

    public void setUpiId(String upiId) {
        this.upiId = upiId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getWalletId() {
        return walletId;
    }

    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }

    @Override
    public String toString() {
        return "PaymentRequest{" +
                "type=" + type +
                ", amount=" + amount +
                ", upiId='" + upiId + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", walletId='" + walletId + '\'' +
                '}';
    }
}
