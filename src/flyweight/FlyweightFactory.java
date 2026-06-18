package flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private static final Map<String, CarBrand> carBrandMap = new HashMap<>();

    public static CarBrand getCarBrand(String brandName, String brandManufacturingTechSpec) {
        carBrandMap.computeIfAbsent(brandName, n -> new CarBrand(n, brandManufacturingTechSpec));

        return carBrandMap.get(brandName);
    }
}
