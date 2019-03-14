package abstract_factory;

import abstract_factory.factory.AbstractFactory;
import abstract_factory.factory.FactoryProducer;
import abstract_factory.shapes.Shape;

public class App {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = FactoryProducer.getFactory("Shape");
        Shape shape = abstractFactory.getShape("Circle");
        shape.draw();

    }
}
