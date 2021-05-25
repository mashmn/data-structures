package designpatterns.structural.decorator;

import designpatterns.structural.decorator.components.FlowerBouquet;
import designpatterns.structural.decorator.components.OrchidBouquet;
import designpatterns.structural.decorator.components.RoseBouquet;
import designpatterns.structural.decorator.decorators.Glitter;
import designpatterns.structural.decorator.decorators.PaperWrapper;
import designpatterns.structural.decorator.decorators.RibbonBow;
import org.junit.jupiter.api.Test;

public class FlowerBouquetTest {

    @Test
    public void testFlowerBouquet() {
        /* Rose Bouquet with no decoration */
        FlowerBouquet roseBouquet = new RoseBouquet();
        System.out.println(roseBouquet.getDescription() +
                " $" + roseBouquet.cost());

        /* Rose Bouquet with Paper wrap, Ribbon bow and Glitter decorations */
        FlowerBouquet decoratedRoseBouquet = new RoseBouquet();
        decoratedRoseBouquet = new PaperWrapper(decoratedRoseBouquet);
        decoratedRoseBouquet = new RibbonBow(decoratedRoseBouquet);
        decoratedRoseBouquet = new Glitter(decoratedRoseBouquet);
        System.out.println(decoratedRoseBouquet.getDescription() +
                " $" + decoratedRoseBouquet.cost());

        /* Orchid Bouquet with double Paper Wrap and ribbon bow */
        FlowerBouquet decoratedOrchidBouquet = new OrchidBouquet();
        decoratedOrchidBouquet = new PaperWrapper(decoratedOrchidBouquet);
        decoratedOrchidBouquet = new PaperWrapper(decoratedOrchidBouquet);
        decoratedOrchidBouquet = new RibbonBow(decoratedOrchidBouquet);
        System.out.println(decoratedOrchidBouquet.getDescription() +
                " $" + decoratedOrchidBouquet.cost());
    }
}
