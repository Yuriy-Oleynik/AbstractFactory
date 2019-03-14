package abstract_factory.factory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String nameFactory) {

        if(nameFactory.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        }else if(nameFactory.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }

        return null;
    }
}
