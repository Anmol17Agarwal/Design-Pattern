package AdaptorPattern.PaymentService;

public class RazorpayAdapter implements PaymentGateway {

    private RazorpayAPI razorpayAPI;

    public RazorpayAdapter(RazorpayAPI razorpayAPI) {
        this.razorpayAPI = razorpayAPI;
    }

    @Override
    public void pay(PaymentRequest request) {

        if (request.getPhone() == null) {
            throw new IllegalArgumentException("Razorpay requires phone number!");
        }

        razorpayAPI.sendPayment(request.getAmount(), request.getPhone());
    }
}
