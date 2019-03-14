package abstract_factory.factory;

import abstract_factory.colors.Blue;
import abstract_factory.colors.Color;
import abstract_factory.colors.Green;
import abstract_factory.colors.Red;
import abstract_factory.shapes.Shape;

public class ColorFactory extends AbstractFactory {
    @Override
    public Shape getShape(String nameShape) {
        return null;
    }

    @Override
    public Color getColor(String nameColor) {

        if (nameColor.equalsIgnoreCase("Blue")) {
            return new Blue();
        } else if (nameColor.equalsIgnoreCase("Green")) {
            return new Green();
        } else if (nameColor.equalsIgnoreCase("Red")) {
            return new Red();
        }
        return null;
    }
}
