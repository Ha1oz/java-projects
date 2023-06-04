package entities;

public class Truck extends Transport {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void updateTyre() {
        System.out.println("Changing the tire...");
    }
    @Override
    public void checkEngine() {
        System.out.println("Checking the engine...");

    }
    @Override
    public void checkTrailer() {
        System.out.println("Checking the trailer...");
    }
}
