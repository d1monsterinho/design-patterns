package decorator;

public class AdditionalTomatoesPizzaDecorator extends PizzaBaseDecorator {

    public AdditionalTomatoesPizzaDecorator(AbstractPizza abstractPizza) {
        super(abstractPizza);
    }

    @Override
    public String checkPizzaIngredients() {
        return super.checkPizzaIngredients()
                + " Supplied with additional tomatoes.";
    }
}
