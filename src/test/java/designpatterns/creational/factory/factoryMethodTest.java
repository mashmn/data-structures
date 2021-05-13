package designpatterns.creational.factory;

import designpatterns.creational.factoryMethod.creator.BasePizzaFactory;
import designpatterns.creational.factoryMethod.product.Pizza;

import org.junit.jupiter.api.Test;

public class factoryMethodTest {

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
        BasePizzaFactory pizzaFactory = new designpatterns.creational.factoryMethod.concreteCreator.PizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza("cheese");
        Pizza veggiePizza = pizzaFactory.createPizza("veggie");
    }
}
