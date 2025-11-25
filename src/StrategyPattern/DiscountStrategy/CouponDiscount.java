package StrategyPattern.DiscountStrategy;

public class CouponDiscount implements DiscountStrategy {

    private String coupon;

    public CouponDiscount(String coupon) {
        this.coupon = coupon;
    }

    @Override
    public double applyDiscount(double amount) {

        if(coupon.equals("FLAT100"))
            return amount - 100;

        if(coupon.equals("SAVE20"))
            return amount * 0.80;  // 20% OFF

        return amount; // invalid coupon, no discount
    }
}

