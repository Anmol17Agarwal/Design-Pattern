package StrategyPattern.discount_strategy;

public class DiscountClient {

    public static void main(String[] args) {

        DiscountContext context = new DiscountContext();

        // FESTIVAL Discount
        context.setStrategy(DiscountFactory.getStrategy(DiscountType.FESTIVAL));
        System.out.println("Festival Discount: " + context.apply(1000));

        // NEW USER Discount
        context.setStrategy(DiscountFactory.getStrategy(DiscountType.NEW_USER));
        System.out.println("New User Discount: " + context.apply(1000));

        // COUPON Discount (Dynamic)
        context.setStrategy(new CouponDiscount("FLAT100"));
        System.out.println("Coupon(flat100): " + context.apply(1000));

        context.setStrategy(new CouponDiscount("SAVE20"));
        System.out.println("Coupon(save20): " + context.apply(1000));
    }
}

