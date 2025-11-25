package StrategyPattern.search_sort_strategy;

import java.util.List;

public class DeliveryTimeSortStrategy implements SortStrategy{
    @Override
    public List<Restaurant> sort(List<Restaurant> restaurants) {
        restaurants.sort((a,b)->Integer.compare(a.getDeliveryTime(), b.getDeliveryTime()));
        return restaurants;
    }
}
