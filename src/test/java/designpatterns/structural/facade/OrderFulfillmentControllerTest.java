package designpatterns.structural.facade;

import designpatterns.structural.facade.controller.OrderFulfillmentController;
import designpatterns.structural.facade.serviceFacade.OrderServiceFacadeImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderFulfillmentControllerTest {

    @Test
    public void testOrderProduct() throws Exception {
        OrderFulfillmentController controller = new OrderFulfillmentController();
        controller.facade = new OrderServiceFacadeImpl();
        controller.orderProduct(3);
        boolean result = controller.orderFulfilled;
        Assertions.assertTrue(result);
    }
}
