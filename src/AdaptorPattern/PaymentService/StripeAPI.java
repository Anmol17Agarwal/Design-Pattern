package AdaptorPattern.PaymentService;

public class StripeAPI {
    public void chargeCard(String email, double amount) {
        System.out.println("Stripe Payment Done via Email: " + email);
    }
}
