package StrategyPattern.DiscountStrategy;

public class NewUserDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.90; // 10% OFF
    }
}

