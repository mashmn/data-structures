package designpatterns.creational.abstractFactory.product.concreteProducts;

import designpatterns.creational.abstractFactory.topping.BaseToppingFactory;
import designpatterns.creational.abstractFactory.product.Pizza;

public class PepperoniPizza extends Pizza {

    BaseToppingFactory toppingFactory;

    public PepperoniPizza(BaseToppingFactory toppingFactory) {
        this.toppingFactory = toppingFactory;
    }

    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for Pepperoni pizza.");
        toppingFactory.createCheese();
        toppingFactory.createSauce();
    }
}
