package designpatterns.creational.abstractFactory.topping.cheese;

/**
 * GoatCheese is a ConcreteProduct to implement Cheese
 */
public class GoatCheese implements Cheese {

    public GoatCheese() {
        prepareCheese();
    }

    @Override
    public void prepareCheese() {
        System.out.println("Preparing Goat Cheese");
    }
}
