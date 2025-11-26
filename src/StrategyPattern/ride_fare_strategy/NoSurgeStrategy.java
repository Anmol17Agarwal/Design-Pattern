package StrategyPattern.ride_fare_strategy;

public class NoSurgeStrategy implements SurgePriceStrategy{
    @Override
    public double applySurgePrice(double baseFare) {
        return baseFare;
    }
}
