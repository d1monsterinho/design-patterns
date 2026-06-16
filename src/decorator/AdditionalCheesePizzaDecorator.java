package decorator;

public class AdditionalCheesePizzaDecorator extends PizzaBaseDecorator {

    public AdditionalCheesePizzaDecorator(AbstractPizza abstractPizza) {
        super(abstractPizza);
    }

    public String checkPizzaIngredients() {
        return super.checkPizzaIngredients() +
                " Supplied with additional cheese.";
    }
}
