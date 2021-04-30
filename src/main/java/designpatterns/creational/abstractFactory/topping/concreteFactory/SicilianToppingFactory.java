package designpatterns.creational.abstractFactory.topping.concreteFactory;

import designpatterns.creational.abstractFactory.topping.BaseToppingFactory;
import designpatterns.creational.abstractFactory.topping.cheese.Cheese;
import designpatterns.creational.abstractFactory.topping.cheese.MozzarellaCheese;
import designpatterns.creational.abstractFactory.topping.sauce.Sauce;
import designpatterns.creational.abstractFactory.topping.sauce.TomatoSauce;

/**
 *  ConcreteFactory
 *  returns MozzarellaCheese and TomatoSauce objects
 */
public class SicilianToppingFactory extends BaseToppingFactory {

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Sauce createSauce() {
        return new TomatoSauce();
    }
}
