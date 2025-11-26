package StrategyPattern.ride_fare_strategy;

public class WeatherSurgeStrategy implements SurgePriceStrategy{
    @Override
    public double applySurgePrice(double baseFare) {
        return baseFare * 2.5;
    }
}
