package designpatterns.creational.factoryMethod.concreteCreator;

import designpatterns.creational.factoryMethod.product.Pizza;
import designpatterns.creational.factoryMethod.creator.BasePizzaFactory;
import designpatterns.creational.factoryMethod.concreteProducts.CheesePizza;
import designpatterns.creational.factoryMethod.concreteProducts.PepperoniPizza;
import designpatterns.creational.factoryMethod.concreteProducts.VeggiePizza;

/**
 * ConcreteCreator
 * Implemented the createPizza() factory method
 */
public class PizzaFactory extends BasePizzaFactory {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        switch (type.toLowerCase()) {
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
            case "veggie":
                pizza = new VeggiePizza();
                break;
            default: throw new IllegalArgumentException("No such pizza.");
        }
        pizza.addIngredients();
        pizza.bakePizza();
        return pizza;
    }
}
