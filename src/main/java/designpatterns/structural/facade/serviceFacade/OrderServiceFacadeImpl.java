package designpatterns.structural.facade.serviceFacade;

import designpatterns.structural.facade.domain.Product;
import designpatterns.structural.facade.subcomponents.InventoryService;
import designpatterns.structural.facade.subcomponents.PaymentService;
import designpatterns.structural.facade.subcomponents.ShippingService;

/**
 * OrderServiceFacadeImpl
 * placeOrder() consolidates all subsystem interactions.
 */
public class OrderServiceFacadeImpl implements OrderServiceFacade{

    @Override
    public boolean placeOrder(int productId) {
        boolean orderFulfilled = false;
        Product product = new Product();
        product.productId = productId;

        if(InventoryService.isAvailable(product)) {
            System.out.println("Product with ID: " + product.productId + " is available");
            boolean paymentConfirmed = PaymentService.makePayment();
            if(paymentConfirmed) {
                System.out.println("Payment confirmed");
                ShippingService.shipProduct(product);
                System.out.println("Product shipped... ");
                orderFulfilled = true;
            }
        }

        return orderFulfilled;
    }
}
