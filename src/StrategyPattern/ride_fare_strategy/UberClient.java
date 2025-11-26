package StrategyPattern.ride_fare_strategy;

public class UberClient {
    public static void main(String[] args) throws IllegalAccessException {
        FareCalculator calculator = new FareCalculator();

        RideRequest request1 = new RideRequest(12,10,SurgeType.PEAK_TYPE);
        System.out.println("Peak Hour Fare :"+calculator.calculateFare(request1));

        RideRequest request2 = new RideRequest(5,12,SurgeType.NEW_USER);
        System.out.println("New User Fare :"+calculator.calculateFare(request2));

        RideRequest request3 = new RideRequest(25,15,SurgeType.WEATHER);
        System.out.println("Rain Surge Fare :"+calculator.calculateFare(request3));

        RideRequest request4 = new RideRequest(30,40,SurgeType.VIP);
        System.out.println("VIP Fare :"+calculator.calculateFare(request4));

        RideRequest request5 = new RideRequest(4,10,SurgeType.NONE);
        System.out.println("Normal Fare :"+calculator.calculateFare(request5));

    }
}
