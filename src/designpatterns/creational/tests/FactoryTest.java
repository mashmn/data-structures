package designpatterns.creational.tests;

import designpatterns.creational.factory.concretecreator.PizzaFactory;
import designpatterns.creational.factory.creator.BasePizzaFactory;
import designpatterns.creational.factory.product.Pizza;
import org.junit.jupiter.api.Test;

public class FactoryTest {

    /**
     * Factory method pattern
     *
     * Product => Pizza
     * ConcreteProduct => CheesePizza
     * Creator => BasePizzaFactory
     * ConcreteCreator => PizzaFactory
     *
     * No concrete Pizza objects were created
     * Factory method helps encapsulate object creation code from client code.
     * This decouples your client code from the concrete classes you need to instantiate..
     * To encapsulate and centralize object creation code
     */
    @Test
    public void testMakePizzas() {
        BasePizzaFactory pizzaFactory = new PizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza("cheese");
        Pizza veggiePizza = pizzaFactory.createPizza("veggie");
    }
}
