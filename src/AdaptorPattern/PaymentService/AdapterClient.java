package AdaptorPattern.PaymentService;

public class AdapterClient {
    public static void main(String[] args) {

        PaymentRequest request = new PaymentRequest();
        request.setAmount(500);
        request.setPhone("9876543210");
        request.setEmail("user@gmail.com");

        // choose provider dynamically
        PaymentGateway pg = new RazorpayAdapter(new RazorpayAPI());
        pg.pay(request);

        PaymentGateway pg2 = new StripeAdapter(new StripeAPI());
        pg2.pay(request);
    }
}
