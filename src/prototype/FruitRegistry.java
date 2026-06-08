package prototype;

import java.util.HashMap;
import java.util.Map;

public class FruitRegistry {
    private final Map<String, Fruit> fruitRegistry;

    public FruitRegistry() {
        fruitRegistry = new HashMap<>();
        initializeRegistryWithPopularFruitPrototypes();
    }

    private void initializeRegistryWithPopularFruitPrototypes() {
        Apple heavyRedAppleOfBreedA = new Apple("Red", 600, "Breed A");
        Apple mediumGreenAppleOfBreedB = new Apple("Green", 350, "Breed B");
        Banana lightShortGreenBanana = new Banana("Green", 200, 10);

        fruitRegistry.put("Heavy Red Apple A", heavyRedAppleOfBreedA);
        fruitRegistry.put("Medium Green Apple B", mediumGreenAppleOfBreedB);
        fruitRegistry.put("Light Short Green Banana", lightShortGreenBanana);
    }

    public void put(String key, Fruit value) {
        fruitRegistry.put(key, value);
    }

    public Fruit get(String key) {
        return fruitRegistry.get(key);
    }
}
