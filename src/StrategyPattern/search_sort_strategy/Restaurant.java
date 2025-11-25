package StrategyPattern.search_sort_strategy;

public class Restaurant {
    private String name;
    private double distance;
    private double rating;
    private int deliveryTime;

    public Restaurant(String name, double distance, double rating, int deliveryTime) {
        this.name = name;
        this.distance = distance;
        this.rating = rating;
        this.deliveryTime = deliveryTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(int deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", distance=" + distance +
                ", rating=" + rating +
                ", deliveryTime=" + deliveryTime +
                '}';
    }
}
