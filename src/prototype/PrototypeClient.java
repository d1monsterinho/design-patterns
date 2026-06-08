package prototype;

public class PrototypeClient {
    public void clonePrototypeAndPrintEqualityTest() {
        FruitRegistry registry = new FruitRegistry();

        Apple apple = (Apple) registry.get("Heavy Red Apple A");
        Apple appleClone = apple.clone();

        System.out.println("Reference equality test: " + (apple == appleClone));
        System.out.println("Meaning equality test: " + (apple.equals(appleClone)));
    }
}
