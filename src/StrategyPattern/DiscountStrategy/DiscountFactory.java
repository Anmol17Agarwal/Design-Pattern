package StrategyPattern.DiscountStrategy;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class DiscountFactory {

    private static final Map<DiscountType, Supplier<DiscountStrategy>> map = new HashMap<>();

    static {
        map.put(DiscountType.FESTIVAL, FestiveDiscount::new);
        map.put(DiscountType.NEW_USER, NewUserDiscount::new);
    }

    public static DiscountStrategy getStrategy(DiscountType type) {

        Supplier<DiscountStrategy> supplier = map.get(type);

        if (supplier != null) {
            return supplier.get();
        }

        throw new IllegalArgumentException("Unsupported discount type: " + type);
    }
}
