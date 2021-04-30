package designpatterns.creational.abstractFactory.topping.sauce;

/**
 * TomatoSauce is a ConcreteProduct to implement Sauce
 */
public class TomatoSauce implements Sauce {

    public TomatoSauce() {
        this.prepareSauce();
    }

    @Override
    public void prepareSauce() {
        System.out.println("Preparing Tomato Sauce");
    }
}
