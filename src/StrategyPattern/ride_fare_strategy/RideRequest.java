package StrategyPattern.ride_fare_strategy;

public class RideRequest {
    private double distanceInKm;
    private double timeMinutes;
    private SurgeType surgeType;

    public RideRequest(double distanceInKm, double timeMinutes, SurgeType surgeType) {
        this.distanceInKm = distanceInKm;
        this.timeMinutes = timeMinutes;
        this.surgeType = surgeType;
    }

    public double getDistanceInKm() {
        return distanceInKm;
    }

    public void setDistanceInKm(double distanceInKm) {
        this.distanceInKm = distanceInKm;
    }

    public double getTimeMinutes() {
        return timeMinutes;
    }

    public void setTimeMinutes(double timeMinutes) {
        this.timeMinutes = timeMinutes;
    }

    public SurgeType getSurgeType() {
        return surgeType;
    }

    public void setSurgeType(SurgeType surgeType) {
        this.surgeType = surgeType;
    }
}
