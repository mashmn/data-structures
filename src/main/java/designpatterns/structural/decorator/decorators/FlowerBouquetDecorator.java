package designpatterns.structural.decorator.decorators;

import designpatterns.structural.decorator.components.FlowerBouquet;

public abstract class FlowerBouquetDecorator extends FlowerBouquet {
    public abstract String getDescription();
}
