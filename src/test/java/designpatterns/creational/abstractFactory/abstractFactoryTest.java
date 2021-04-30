package designpatterns.creational.abstractFactory;

import designpatterns.creational.abstractFactory.GourmetPizzaFactory;
import designpatterns.creational.abstractFactory.SicilianPizzaFactory;
import designpatterns.creational.abstractFactory.product.BasePizzaFactory;
import designpatterns.creational.abstractFactory.product.Pizza;

import org.junit.jupiter.api.Test;

public class abstractFactoryTest {

    @Test
    public void testCreateGourmetPizza() throws Exception {
        BasePizzaFactory pizzaFactory = new GourmetPizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza("cheese");
        Pizza veggiePizza = pizzaFactory.createPizza("veggie");
    }

    @Test
    public void testCreateSicilianPizza() throws Exception {
        BasePizzaFactory pizzaFactory = new SicilianPizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza("cheese");
        Pizza veggiePizza = pizzaFactory.createPizza("veggie");
    }
}
