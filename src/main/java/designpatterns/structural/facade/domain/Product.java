package designpatterns.structural.facade.domain;

/**
 * Domain class - Product
 *
 * Facade Pattern
 */
public class Product {
    public int productId;
    public String name;
    public Product() {}

    public Product (int productId, String name) {
        this.productId = productId;
        this.name = name;
    }
}
