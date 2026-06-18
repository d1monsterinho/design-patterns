package flyweight;

import java.util.ArrayList;
import java.util.List;

public class FlyweightClient {
    private final List<Car> cars;

    public FlyweightClient() {
        this.cars = new ArrayList<>();
    }

    public void moveCars() {
        CarBrand mercedesBrand = FlyweightFactory.getCarBrand(
                "Mercedes-Benz", "[COMPLEX MERCEDES SPECIFICATION OBJECT]");
        CarBrand audiBrand = FlyweightFactory.getCarBrand(
                "Audi", "[COMPLEX AUDI SPECIFICATION OBJECT]");

        for (int i = 0; i < 1_000_000; i++) {
            cars.add(new Car(mercedesBrand, i + 1, i + 1, 120));
            cars.add(new Car(audiBrand, i + 1, i + 1, 130));
        }

        mercedesBrand.move(cars.get(100));

        System.out.println("\n");

        audiBrand.move(cars.get(1000));
    }
}
