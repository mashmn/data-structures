package designpatterns.creational.factoryMethod.product;

/**
 * Product
 * An abstract class with an abstract addIngredients() method and bakePizza() method
 */
public abstract class Pizza {

    public abstract void addIngredients();

    public void bakePizza() {
        System.out.println("Pizza baked at 400 for 20 minutes");
    }
}
