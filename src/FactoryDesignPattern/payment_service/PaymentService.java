package FactoryDesignPattern.payment_service;

public class PaymentService {

    public PaymentResponse processPayment(PaymentRequest request) {

        // Step 1: Validate input
        PaymentValidator.validate(request);

        // Step 2: Route to correct processor
        PaymentProcessor processor = PaymentRouterFactory.getProcessor(request.getType());

        // Step 3: Process payment
        return processor.pay(request);
    }
}

