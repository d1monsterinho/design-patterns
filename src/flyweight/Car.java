package flyweight;

public class Car {
    private int currentSpeedInKm;
    private int targetXCoord;
    private int targetYCoord;

    private final CarBrand carBrand;

    public Car(CarBrand carBrand, int targetYCoord, int targetXCoord, int currentSpeedInKm) {
        this.carBrand = carBrand;
        this.targetYCoord = targetYCoord;
        this.targetXCoord = targetXCoord;
        this.currentSpeedInKm = currentSpeedInKm;
    }

    public int getCurrentSpeedInKm() {
        return currentSpeedInKm;
    }

    public void setCurrentSpeedInKm(int currentSpeedInKm) {
        this.currentSpeedInKm = currentSpeedInKm;
    }

    public int getTargetXCoord() {
        return targetXCoord;
    }

    public void setTargetXCoord(int targetXCoord) {
        this.targetXCoord = targetXCoord;
    }

    public int getTargetYCoord() {
        return targetYCoord;
    }

    public void setTargetYCoord(int targetYCoord) {
        this.targetYCoord = targetYCoord;
    }
}
