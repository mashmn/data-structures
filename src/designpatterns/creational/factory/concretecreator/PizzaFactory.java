package designpatterns.creational.factory.concretecreator;

import designpatterns.creational.factory.product.Pizza;
import designpatterns.creational.factory.creator.BasePizzaFactory;
import designpatterns.creational.factory.concreteproduct.CheesePizza;
import designpatterns.creational.factory.concreteproduct.PepperoniPizza;
import designpatterns.creational.factory.concreteproduct.VeggiePizza;

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
