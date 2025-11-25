package StrategyPattern.search_sort_strategy;

import java.util.List;

public class SortContext {

    private SortStrategy strategy;

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public List<Restaurant> sort(List<Restaurant> restaurants) {
        return strategy.sort(restaurants);
    }
}

