package designpatterns.structural.facade.subcomponents;

import designpatterns.structural.facade.domain.Product;

public class InventoryService {
    public static boolean isAvailable(Product product) {
        /* Check warehouse database for product availability */
        return true;
    }
}
