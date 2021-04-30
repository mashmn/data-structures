package designpatterns.creational.abstractFactory;

import designpatterns.creational.abstractFactory.product.BasePizzaFactory;
import designpatterns.creational.abstractFactory.topping.BaseToppingFactory;
import designpatterns.creational.abstractFactory.topping.concreteFactory.GourmetToppingFactory;
import designpatterns.creational.abstractFactory.product.concreteProducts.CheesePizza;
import designpatterns.creational.abstractFactory.product.concreteProducts.PepperoniPizza;
import designpatterns.creational.abstractFactory.product.concreteProducts.VeggiePizza;
import designpatterns.creational.abstractFactory.product.Pizza;

public class GourmetPizzaFactory extends BasePizzaFactory {

    @Override
    public Pizza createPizza(String type) {

        Pizza pizza;

        // BaseToppingFactory object
        BaseToppingFactory toppingFactory = new GourmetToppingFactory();

        switch(type.toLowerCase()) {
            case "cheese":
                pizza = new CheesePizza(toppingFactory);
                break;
            case "veggie":
                pizza = new VeggiePizza(toppingFactory);
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(toppingFactory);
                break;
            default: throw new IllegalArgumentException("No such pizza");
        }

        pizza.addIngredients();
        pizza.bakePizza();

        return pizza;
    }
}
