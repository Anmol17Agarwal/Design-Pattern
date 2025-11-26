package StrategyPattern.ride_fare_strategy;

public class VIPCustomerStrategy implements SurgePriceStrategy{
    @Override
    public double applySurgePrice(double baseFare) {
        return baseFare * 0.9;
    }
}
