package designpatterns.creational.abstractFactory.topping.concreteFactory;

import designpatterns.creational.abstractFactory.topping.BaseToppingFactory;
import designpatterns.creational.abstractFactory.topping.sauce.CaliforniaOilSauce;
import designpatterns.creational.abstractFactory.topping.cheese.Cheese;
import designpatterns.creational.abstractFactory.topping.cheese.GoatCheese;
import designpatterns.creational.abstractFactory.topping.sauce.Sauce;

/**
 * ConcreteFactory
 * returns GoatCheese and CaliforniaOilSauce objects
 */
public class GourmetToppingFactory extends BaseToppingFactory {

    @Override
    public Cheese createCheese() {
        return new GoatCheese();
    }

    @Override
    public Sauce createSauce() {
        return new CaliforniaOilSauce();
    }
}
