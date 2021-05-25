package designpatterns.structural.decorator.components;

/**
 * Decorator Pattern - Attach additional responsibilities to an object dynamically.
 * Open Closed Principle - Open for extension, closed for modification
 *
 * With composition,you can dynamically add multiple new responsibilities to objects at run time.
 */
public abstract class FlowerBouquet {
    String description;
    public String getDescription() {
        return description;
    }
    public abstract double cost();
}
