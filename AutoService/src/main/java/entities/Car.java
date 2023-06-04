package entities;

public class Car extends Transport {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void updateTyre() {
        System.out.println("Changing the tire...");
    }
    @Override
    public void checkEngine() {
        serviceInvalid("Check engine");
    }
    @Override
    public void checkTrailer() {
        serviceInvalid("Check trailer");
    }
}
