package FactoryDesignPattern.payment_service;

import java.util.Map;
import java.util.HashMap;
import java.util.function.Supplier;

public class PaymentRouterFactory {

    private static final Map<PaymentType, Supplier<PaymentProcessor>> map = new HashMap<>();

    static {
        map.put(PaymentType.UPI, UpiPaymentProcessor::new);
        map.put(PaymentType.CARD, CardPaymentProcessor::new);
        map.put(PaymentType.WALLET, WalletPaymentProcessor::new);
    }

    public static PaymentProcessor getProcessor(PaymentType type) {
        Supplier<PaymentProcessor> supplier = map.get(type);

        if (supplier == null) {
            throw new InvalidPaymentException("Unsupported payment type: " + type);
        }

        return supplier.get();
    }
}
