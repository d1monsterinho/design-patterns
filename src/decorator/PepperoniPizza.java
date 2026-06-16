package decorator;

public class PepperoniPizza extends AbstractPizza {
    private final String pepperoniIngredients = "Regular Pepperoni Pizza.";

    @Override
    public String checkPizzaIngredients() {
        return pepperoniIngredients;
    }
}
