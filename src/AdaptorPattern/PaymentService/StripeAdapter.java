package AdaptorPattern.PaymentService;

public class StripeAdapter implements PaymentGateway {

    private StripeAPI stripeAPI;

    public StripeAdapter(StripeAPI stripeAPI) {
        this.stripeAPI = stripeAPI;
    }

    @Override
    public void pay(PaymentRequest request) {

        if (request.getEmail() == null) {
            throw new IllegalArgumentException("Stripe requires email!");
        }

        stripeAPI.chargeCard(request.getEmail(), request.getAmount());
    }
}
