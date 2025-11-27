package AdaptorPattern.PaymentService;

public class RazorpayAPI {
    public void sendPayment(double amount, String mobileNumber) {
        System.out.println("Razorpay Payment Done via Phone: " + mobileNumber);
    }
}
