package designpatterns.structural.decorator.components;

import designpatterns.structural.decorator.components.FlowerBouquet;

public class RoseBouquet extends FlowerBouquet {
    public RoseBouquet(){
        description = "Rose Bouquet";
    }

    public double cost() {
        return 12.0;
    }
}
