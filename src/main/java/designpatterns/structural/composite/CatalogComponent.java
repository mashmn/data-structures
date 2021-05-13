package designpatterns.structural.composite;

/**
 * CatalogComponent - An abstract base class for the objects in the tree structure. This class defines the default
 * behavior for all objects and behaviors to access and manage child components in the tree.
 *
 * add() and remove() -> composite methods that adds and removes CatalogComponent objects respectively.
 *
 * Composite Pattern:
 * Component -> CatalogComponent            <--- Client
 *        /                  \
 *      / inheritance         \  inheritance
 *     /                       \
 * Leaf -> Product           Composite -> ProductCatalog [aggregation: ProductCatalog can contain instance of Product &
 *                                      other ProductCatalog both of which are CatalogComponent]
 *
 * Client -> interacts with Component
 *
 * UnsupportedOperationException - not mandatory but some methods will only be relevant to Product while some to
 * ProductCatalog.
 *
 * Constructor invocations should be done in proper order. An alternative in Spring is to configure the components
 * through setter injections to break any cyclic reference required during construction.
 */
public abstract class CatalogComponent {

    // Composite method
    public void add(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("Cannot add item to catalog.");
    }

    // Composite method
    public void remove(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("Cannot remove item from catalog.");
    }

    // Operation method
    public String getName() {
        throw new UnsupportedOperationException("Cannot return name.");
    }

    // Operation method
    public double getPrice() {
        throw new UnsupportedOperationException("Cannot return price.");
    }

    // Operation method
    public void print() {
        throw new UnsupportedOperationException("Cannot print.");
    }
}
