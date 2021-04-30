package designpatterns.creational.factory.concreteproduct;

import designpatterns.creational.factory.product.Pizza;

/**
 * ConcreteProduct
 * Subclass which is an implementation of the addIngredients() method
 * Subclass being derived from Pizza (Product) inherits the bakePizza() method.
 */
public class CheesePizza extends Pizza {

    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for cheese pizza");
    }
}