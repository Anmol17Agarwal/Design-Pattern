package FactoryDesignPattern.payment_service;

public class PaymentClient {
    public static void main(String[] args) {

        PaymentService service = new PaymentService();

        PaymentRequest req = new PaymentRequest();
        req.setType(PaymentType.UPI);
        req.setAmount(1500);
        req.setUpiId("user@okhdfcbank");

        PaymentResponse res = service.processPayment(req);
        System.out.println(res.toString());
    }
}

