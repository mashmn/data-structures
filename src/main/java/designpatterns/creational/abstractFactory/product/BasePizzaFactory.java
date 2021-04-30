package designpatterns.creational.abstractFactory.product;

import designpatterns.creational.abstractFactory.product.Pizza;

public abstract class BasePizzaFactory {
    public abstract Pizza createPizza(String type);
}
