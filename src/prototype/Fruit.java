package prototype;

import java.util.Objects;

public abstract class Fruit {
    private String color;
    private int weightInGrams;

    public Fruit() {
    }

    public Fruit(String color, int weightInGrams) {
        this.color = color;
        this.weightInGrams = weightInGrams;
    }

    public Fruit(Fruit fruit) {
        this.color = fruit.color;
        this.weightInGrams = fruit.weightInGrams;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeightInGrams() {
        return weightInGrams;
    }

    public void setWeightInGrams(int weightInGrams) {
        this.weightInGrams = weightInGrams;
    }

    public abstract Fruit clone();

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Fruit fruit = (Fruit) o;
        return weightInGrams == fruit.weightInGrams && Objects.equals(color, fruit.color);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(color);
        result = 31 * result + weightInGrams;
        return result;
    }
}
