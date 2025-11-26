package StrategyPattern.ride_fare_strategy;

public class FareCalculator {
    private static final double BASE_FARE =30.0;
    private static final double PER_KM_RATE=11.50;
    private static final double PER_MIN_RATE=1.25;

    public double calculateFare(RideRequest request) throws IllegalAccessException {
        double fare = BASE_FARE
                + (request.getDistanceInKm()*PER_KM_RATE)
                + (request.getTimeMinutes()*PER_MIN_RATE);

        SurgePriceStrategy strategy = SurgeFactory.getStrategy(request.getSurgeType());
        return strategy.applySurgePrice(fare);
    }
}
