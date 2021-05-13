package designpatterns.structural.composite;

import org.junit.jupiter.api.Test;

public class CatalogComponentTest {

    @Test
    public void testPrint() throws Exception {

        /* Create primary products for main catalog */
        CatalogComponent mJeanProduct = new Product("M: Jeans 32", 65.00);
        CatalogComponent mTShirtProduct = new Product("M: T Shirt 38", 45.00);

        CatalogComponent newCatalog = new ProductCatalog("Female products");
        CatalogComponent fJeans = new Product("F: Jeans 32", 65.00);
        CatalogComponent fTShirts = new Product("F: T Shirt 38", 45.00);
        newCatalog.add(fJeans);
        newCatalog.add(fTShirts);

        CatalogComponent kidCatalog = new ProductCatalog("Kids Products");
        CatalogComponent kidShorts = new Product("Return Gift", 23.00);
        CatalogComponent kidPlayGears = new Product("Summer Play Gear", 65.00);
        kidCatalog.add(kidShorts);
        kidCatalog.add(kidPlayGears);

        CatalogComponent mainCatalog = new ProductCatalog("Primary Catalog");
        mainCatalog.add(mJeanProduct);
        mainCatalog.add(mTShirtProduct);
        mainCatalog.add(newCatalog);
        mainCatalog.add(kidCatalog);

        mainCatalog.print();
    }
}
