package abstract_factory.factory;

import abstract_factory.colors.Color;
import abstract_factory.shapes.Circle;
import abstract_factory.shapes.Rectangle;
import abstract_factory.shapes.Shape;
import abstract_factory.shapes.Square;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String nameShape) {
        if (nameShape.equalsIgnoreCase("Circle")) {
            return new Circle();
        } else if (nameShape.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else if (nameShape.equalsIgnoreCase("Square")) {
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String nameColor) {
        return null;
    }
}
