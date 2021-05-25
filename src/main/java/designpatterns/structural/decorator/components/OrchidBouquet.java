package designpatterns.structural.decorator.components;

import designpatterns.structural.decorator.components.FlowerBouquet;

public class OrchidBouquet extends FlowerBouquet {
    public OrchidBouquet() {
        description = "Orchid Bouquet";
    }

    public double cost() {
        return 29.0;
    }
}
