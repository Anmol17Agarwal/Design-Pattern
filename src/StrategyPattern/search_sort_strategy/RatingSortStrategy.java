package StrategyPattern.search_sort_strategy;

import java.util.List;

public class RatingSortStrategy implements SortStrategy{

    @Override
    public List<Restaurant> sort(List<Restaurant> restaurants) {
        restaurants.sort((a,b)->Double.compare(a.getRating(), b.getRating()));
        return restaurants;
    }
}
