package designpatterns.creational.abstractFactory.topping.cheese;

/**
 * MozzarellaCheese is a ConcreteProduct to implement Cheese
 */
public class MozzarellaCheese implements Cheese {

    public MozzarellaCheese() {
        this.prepareCheese();
    }

    @Override
    public void prepareCheese() {
        System.out.println("Preparing Mozzarella Cheese");
    }
}
