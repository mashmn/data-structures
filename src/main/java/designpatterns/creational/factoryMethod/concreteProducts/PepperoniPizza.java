package designpatterns.creational.factoryMethod.concreteProducts;

import designpatterns.creational.factoryMethod.product.Pizza;

/**
 * ConcreteProduct
 * Subclass which is an implementation of the addIngredients() method
 * Subclass being derived from Pizza (Product) inherits the bakePizza() method.
 */
public class PepperoniPizza extends Pizza {

    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for pepperoni pizza");
    }
}
