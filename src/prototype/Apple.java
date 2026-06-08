package prototype;

import java.util.Objects;

public class Apple extends Fruit {
    private String breed;

    public Apple() {
    }

    public Apple(String color, int weightInGrams, String breed) {
        super(color, weightInGrams);
        this.breed = breed;
    }

    public Apple(Apple apple) {
        super(apple);
        this.breed = apple.breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public Apple clone() {
        return new Apple(this);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Apple apple = (Apple) o;
        return Objects.equals(breed, apple.breed);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Objects.hashCode(breed);
        return result;
    }
}
