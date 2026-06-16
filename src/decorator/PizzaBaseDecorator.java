package decorator;

public abstract class PizzaBaseDecorator extends AbstractPizza {
    private final AbstractPizza abstractPizza;

    public PizzaBaseDecorator(AbstractPizza abstractPizza) {
        this.abstractPizza = abstractPizza;
    }

    @Override
    public String checkPizzaIngredients() {
        return abstractPizza.checkPizzaIngredients();
    }
}
