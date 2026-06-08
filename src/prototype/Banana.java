package prototype;

public class Banana extends Fruit {
    private int length;

    public Banana() {
    }

    public Banana(String color, int weightInGrams, int length) {
        super(color, weightInGrams);
        this.length = length;
    }

    public Banana(Banana banana) {
        super(banana);
    }

    @Override
    public Banana clone() {
        return new Banana(this);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Banana banana = (Banana) o;
        return length == banana.length;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + length;
        return result;
    }
}
