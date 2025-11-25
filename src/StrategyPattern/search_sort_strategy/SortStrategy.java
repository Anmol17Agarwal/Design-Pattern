package StrategyPattern.search_sort_strategy;

import java.util.List;

public interface SortStrategy {
    List<Restaurant> sort(List<Restaurant> restaurants);
}
