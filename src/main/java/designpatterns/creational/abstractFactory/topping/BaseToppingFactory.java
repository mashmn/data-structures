package designpatterns.creational.abstractFactory.topping;

import designpatterns.creational.abstractFactory.topping.cheese.Cheese;
import designpatterns.creational.abstractFactory.topping.sauce.Sauce;

/**
 * AbstractFactory
 * BaseToppingFactory abstract class is the AbstractFactory which is
 * providing an “interface to create families of related or dependent objects“
 * Related objects here are Cheese and Sauce which together create the Toppings.
 * Do not specify the concrete classes of the objects to create here.
 * AbstractFactory is not concerned with any of the concreted products like GoatCheese etc.
 * createCheese and createSauce are factory methods used in this AbstractFactory
 */
public abstract class BaseToppingFactory {
    public abstract Cheese createCheese();
    public abstract Sauce createSauce();
}
