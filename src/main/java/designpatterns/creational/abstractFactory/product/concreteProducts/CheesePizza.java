package designpatterns.creational.abstractFactory.product.concreteProducts;

import designpatterns.creational.abstractFactory.topping.BaseToppingFactory;
import designpatterns.creational.abstractFactory.product.Pizza;

/**
 * ConcreteProduct
 * CheesePizza is a Pizza object
 */
public class CheesePizza extends Pizza {

    BaseToppingFactory toppingFactory;

    public CheesePizza(BaseToppingFactory toppingFactory) {
        this.toppingFactory = toppingFactory;
    }

    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for cheese pizza.");
        toppingFactory.createCheese();
        toppingFactory.createSauce();
    }
}
