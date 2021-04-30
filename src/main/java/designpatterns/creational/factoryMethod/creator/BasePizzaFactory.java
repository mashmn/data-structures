package designpatterns.creational.factoryMethod.creator;

import designpatterns.creational.factoryMethod.product.Pizza;

/**
 * Creator
 * Abstract BasePizzaFactory class
 */
public abstract class BasePizzaFactory {

    /**
     * createPizza factory method - implementation will be in a concrete subclass
     * PizzaFactory which is the ConcreteCreator
     * @param type - product (pizza) types
     */
    public abstract Pizza createPizza(String type);
}
