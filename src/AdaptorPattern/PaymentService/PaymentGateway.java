package AdaptorPattern.PaymentService;

public interface PaymentGateway {
    void pay(PaymentRequest request);
}

