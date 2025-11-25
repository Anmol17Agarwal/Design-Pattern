package StrategyPattern.search_sort_strategy;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class SortFactory {

    private static final Map<SortType, Supplier<SortStrategy>> map = new HashMap<>();

    static {
        map.put(SortType.RATING, RatingSortStrategy::new);
        map.put(SortType.DISTANCE, DistanceSortStrategy::new);
        map.put(SortType.DELIVERY_TIME, DeliveryTimeSortStrategy::new);
    }

    public static SortStrategy getStrategy(SortType type) {
        Supplier<SortStrategy> strategy = map.get(type);

        if (strategy != null) return strategy.get();

        throw new IllegalArgumentException("Invalid Sort Type: " + type);
    }
}
