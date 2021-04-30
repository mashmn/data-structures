package designpatterns.creational.abstractFactory.topping.sauce;

/**
 * CaliforniaOilSauce is a ConcreteProduct to implement Sauce
 */
public class CaliforniaOilSauce implements Sauce {

    public CaliforniaOilSauce() {
        this.prepareSauce();
    }

    @Override
    public void prepareSauce() {
        System.out.println("Preparing California Oil Sauce");
    }
}
