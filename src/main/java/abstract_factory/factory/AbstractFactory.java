package abstract_factory.factory;

import abstract_factory.colors.Color;
import abstract_factory.shapes.Shape;

public abstract class AbstractFactory {
    public abstract Shape getShape(String nameShape);
    public abstract Color getColor(String nameColor);

}
