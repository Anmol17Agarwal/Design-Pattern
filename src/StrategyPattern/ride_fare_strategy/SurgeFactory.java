package StrategyPattern.ride_fare_strategy;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SurgeFactory {

    private static final Map<SurgeType, Supplier<SurgePriceStrategy>> map = new HashMap<>();

    static {
        map.put(SurgeType.PEAK_TYPE,PeakHourStrategy::new);
        map.put(SurgeType.WEATHER,WeatherSurgeStrategy::new);
        map.put(SurgeType.VIP,VIPCustomerStrategy::new);
        map.put(SurgeType.NEW_USER,NewCustomerStrategy::new);
        map.put(SurgeType.NONE,NoSurgeStrategy::new);
    }

    public static SurgePriceStrategy getStrategy(SurgeType type) throws IllegalAccessException {
        Supplier<SurgePriceStrategy> supplier = map.get(type);
        if(supplier==null){
            throw new IllegalAccessException("Invalid Surge Type:"+type);
        }
        return supplier.get();
    }
}
