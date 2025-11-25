package StrategyPattern.search_sort_strategy;

import java.util.ArrayList;
import java.util.List;

public class SortClient {
    public static void main(String[] args) {

        List<Restaurant> list = new ArrayList<>();
        list.add(new Restaurant("Dominos", 4.2, 3.4, 25));
        list.add(new Restaurant("Burger King", 4.8, 5.1, 30));
        list.add(new Restaurant("KFC", 3.9, 2.5, 20));
        list.add(new Restaurant("Pizza Hut", 4.5, 1.2, 22));

        SortContext context = new SortContext();

        System.out.println("---- Sort By Rating ----");
        context.setStrategy(SortFactory.getStrategy(SortType.RATING));
        context.sort(list).forEach(System.out::println);

        System.out.println("\n---- Sort By Distance ----");
        context.setStrategy(SortFactory.getStrategy(SortType.DISTANCE));
        context.sort(list).forEach(System.out::println);

        System.out.println("\n---- Sort By Delivery Time ----");
        context.setStrategy(SortFactory.getStrategy(SortType.DELIVERY_TIME));
        context.sort(list).forEach(System.out::println);
    }
}

