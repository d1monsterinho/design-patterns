package flyweight;

import java.util.Objects;

public class CarBrand {
    private final String brandName;

    //let's imagine that this field contains huge and heavy object
    private final String brandManufacturingTechSpecification;

    public CarBrand(String brandName, String brandManufacturingTechSpecification) {
        this.brandName = brandName;
        this.brandManufacturingTechSpecification = brandManufacturingTechSpecification;
    }

    public void move(Car car) {
        String template = "%s car is moving to the %d;%d coordinates with %d km/h speed.";

        String movement = String.format(
                template, brandName, car.getTargetXCoord(), car.getTargetYCoord(), car.getCurrentSpeedInKm()) +
                "\n" +
                "+==========+Brand Manufacturing Tech Specification Attached+==========+" +
                "\n" +
                brandManufacturingTechSpecification;

        System.out.println(movement);
    }

    public String getBrandName() {
        return brandName;
    }

    public String getBrandManufacturingTechSpecification() {
        return brandManufacturingTechSpecification;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        CarBrand carBrand = (CarBrand) o;
        return Objects.equals(brandName, carBrand.brandName) && Objects.equals(brandManufacturingTechSpecification, carBrand.brandManufacturingTechSpecification);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(brandName);
        result = 31 * result + Objects.hashCode(brandManufacturingTechSpecification);
        return result;
    }
}
