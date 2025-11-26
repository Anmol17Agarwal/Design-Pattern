package StrategyPattern.ride_fare_strategy;

public class PeakHourStrategy implements SurgePriceStrategy{
    @Override
    public double applySurgePrice(double baseFare) {
        return baseFare*1.5;
    }
}
