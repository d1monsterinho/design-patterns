package decorator;

public class DecoratorClient {
    public void composeAndPrintDecoratedPizza() {
        AdditionalCheesePizzaDecorator additionalCheesePizzaDecorator = new AdditionalCheesePizzaDecorator(
                new AdditionalTomatoesPizzaDecorator(
                        new PepperoniPizza()
                )
        );

        System.out.println(additionalCheesePizzaDecorator.checkPizzaIngredients());
    }
}
