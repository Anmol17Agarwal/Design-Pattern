package StrategyPattern.DiscountStrategy;

public class DiscountContext {

    private DiscountStrategy strategy;

    public void setStrategy(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public double apply(double amount) {
        return strategy.applyDiscount(amount);
    }
}

